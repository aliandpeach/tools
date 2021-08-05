package com.independentsoft.exchange;

import java.io.*;
import java.util.*;
import java.text.*;

final class b
{
    static String a;
    
    static void a() throws IOException {
        b.a = "JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com.";
        try {
            final Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-31");
            final Date time = Calendar.getInstance().getTime();
            if (parse.before(time)) {
                throw new IOException("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Evaluation version has expired.");
            }
            System.out.println("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com.");
            final File file = new File(System.getProperty("user.home") + System.getProperty("file.separator") + ".wsj");
            boolean exists = false;
            try {
                exists = file.exists();
            }
            catch (Exception ex) {
                final int value = Calendar.getInstance().get(5);
                final int value2 = Calendar.getInstance().get(7);
                if (value < 8 && value2 == 3) {
                    System.out.println("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Please contact Independentsoft to obtain extended evaluation version jar file.");
                    System.err.println("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Please contact Independentsoft to obtain extended evaluation version jar file.");
                    throw new IOException("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Please contact Independentsoft to obtain extended evaluation version jar file.");
                }
            }
            if (exists) {
                final Calendar instance;
                (instance = Calendar.getInstance()).setTime(new Date(file.lastModified()));
                instance.add(2, 1);
                if (instance.getTime().before(time)) {
                    System.out.println("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Evaluation version has expired.");
                    System.err.println("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Evaluation version has expired.");
                    throw new IOException("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Evaluation version has expired.");
                }
            }
            else {
                try {
                    file.createNewFile();
                }
                catch (Exception ex2) {
                    final int value3 = Calendar.getInstance().get(5);
                    final int value4 = Calendar.getInstance().get(7);
                    if (value3 < 8 && value4 == 3) {
                        System.out.println("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Please contact Independentsoft to obtain extended evaluation version jar file.");
                        System.err.println("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Please contact Independentsoft to obtain extended evaluation version jar file.");
                        throw new IOException("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Please contact Independentsoft to obtain extended evaluation version jar file.");
                    }
                }
            }
        }
        catch (ParseException ex3) {
            System.out.println("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Evaluation version has expired.");
            System.err.println("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Evaluation version has expired.");
            throw new IOException("JWebServices for Exchange 2.0 evaluation version, www.independentsoft.com. Evaluation version has expired.");
        }
    }
    
    static {
        b.a = "JWebServices for Exchange 2.0, www.independentsoft.com";
    }
}
