/*
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package client;

import javax.activation.CommandMap;
import javax.activation.MailcapCommandMap;
import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.URLName;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Vector;


/**
 * Demo app that shows a very simple Mail Client
 *
 * @author Christopher Cotton
 * @author Bill Shannon
 */

public class SimpleClient
{

    static Vector url = new Vector();
    static FolderViewer fv;
    static MessageViewer mv;

    public static void main(String argv[])
    {
        // -L imap://406925710:mahvlakobjiabgbd@imap.qq.com/

        System.setProperty("mail.store.protocol", "imap");
        System.setProperty("mail.imap.auth", "true");
        System.setProperty("mail.imap.host", "imap.qq.com");
        System.setProperty("mail.imap.port", "143");
        System.setProperty("mail.imap.folder.class", "com.sun.mail.imap.IMAPFolder");

        System.setProperty("proxySet", "true");
        System.setProperty("mail.imap.proxy.host","192.190.10.101");
        System.setProperty("mail.imap.proxy.port","3128");

//        System.setProperty("proxySet","true");
//        System.setProperty("socksProxyHost","192.190.10.101");
//        System.setProperty("socksProxyPort","3128");


//        System.setProperty("http.proxySet", "true");
//        System.setProperty("http.proxyHost", "192.190.10.101");
//        System.setProperty("http.proxyPort", "3128");
//        System.setProperty("https.proxyHost", "192.190.10.101");
//        System.setProperty("https.proxyPort", "3128");

        // ??????????????????jvm??????????????? ??????http https tcp websocket
        System.setProperty("proxyType", "4");
        System.setProperty("proxyPort", "3128");
        System.setProperty("proxyHost", "192.190.10.101");
        System.setProperty("proxySet", "true");

        boolean usage = false;

        for (int optind = 0; optind < argv.length; optind++)
        {
            if (argv[optind].equals("-L"))
            {
                url.addElement(argv[++optind]);
            }
            else if (argv[optind].startsWith("-"))
            {
                usage = true;
                break;
            }
            else
            {
                usage = true;
                break;
            }
        }

        if (usage || url.size() == 0)
        {
            System.out.println("Usage: SimpleClient -L url");
            System.out.println("   where url is protocol://username:password@hostname/");
            System.exit(1);
        }

        try
        {
            // Set up our Mailcap entries.  This will allow the JAF
            // to locate our viewers.
            File capfile = new File(System.getProperty("user.dir") + "/simple.mailcap");
            if (!capfile.isFile())
            {
                System.out.println(
                        "Cannot locate the \"simple.mailcap\" file.");
                System.exit(1);
            }

            CommandMap.setDefaultCommandMap(new MailcapCommandMap(
                    new FileInputStream(capfile)));

            JFrame frame = new JFrame("Simple JavaMail Client");
            frame.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            });
            //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Get a Store object
            SimpleAuthenticator auth = new SimpleAuthenticator(frame);

            Session session =
                    Session.getDefaultInstance(System.getProperties(), auth);
            //session.setDebug(true);

            DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

            // create a node for each store we have
            for (Enumeration e = url.elements(); e.hasMoreElements(); )
            {
                String urlstring = (String) e.nextElement();
                URLName urln = new URLName(urlstring);
                Store store = session.getStore(urln);

                StoreTreeNode storenode = new StoreTreeNode(store);
                root.add(storenode);
            }

            DefaultTreeModel treeModel = new DefaultTreeModel(root);
            JTree tree = new JTree(treeModel);
            tree.addTreeSelectionListener(new TreePress());

            /* Put the Tree in a scroller. */
            JScrollPane sp = new JScrollPane();
            sp.setPreferredSize(new Dimension(250, 300));
            sp.getViewport().add(tree);

            /* Create a double buffered JPanel */
            JPanel sv = new JPanel(new BorderLayout());
            sv.add("Center", sp);

            fv = new FolderViewer(null);

            JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                    sv, fv);
            jsp.setOneTouchExpandable(true);
            mv = new MessageViewer();
            JSplitPane jsp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                    jsp, mv);
            jsp2.setOneTouchExpandable(true);

            frame.getContentPane().add(jsp2);
            frame.pack();
            frame.show();

        }
        catch (Exception ex)
        {
            System.out.println("SimpletClient caught exception");
            ex.printStackTrace();
            System.exit(1);
        }
    }

}

class TreePress implements TreeSelectionListener
{

    public void valueChanged(TreeSelectionEvent e)
    {
        TreePath path = e.getNewLeadSelectionPath();
        if (path != null)
        {
            Object o = path.getLastPathComponent();
            if (o instanceof FolderTreeNode)
            {
                FolderTreeNode node = (FolderTreeNode) o;
                Folder folder = node.getFolder();

                try
                {
                    if ((folder.getType() & Folder.HOLDS_MESSAGES) != 0)
                    {
                        SimpleClient.fv.setFolder(folder);
                    }
                }
                catch (MessagingException me)
                {
                }
            }
        }
    }
}
