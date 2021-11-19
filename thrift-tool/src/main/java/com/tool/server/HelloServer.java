package com.tool.server;

import com.tool.service.HelloServiceImpl;
import com.tool.service.IHelloService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/11/06 15:30:12
 */
public class HelloServer
{
    /**
     * 启动thrift服务器
     *
     * @param args
     */
    public static void main(String[] args)
    {
        try
        {
            System.out.println("服务端开启....");
            TProcessor tprocessor = new IHelloService.Processor<IHelloService.Iface>(new HelloServiceImpl());
            // 简单的单线程服务模型
            TServerSocket serverTransport = new TServerSocket(9898);
            TServer.Args tArgs = new TServer.Args(serverTransport);
            tArgs.processor(tprocessor);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            TServer server = new TSimpleServer(tArgs);
            server.serve();
        }
        catch (TTransportException e)
        {
            e.printStackTrace();
        }
    }
}
