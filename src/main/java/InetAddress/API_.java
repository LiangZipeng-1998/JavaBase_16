package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        //1.获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);// DESKTOP-3PUM1GH/192.168.1.131

        //2.根据指定主机名 获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("DESKTOP-3PUM1GH");
        System.out.println("host1 = " + host1);// DESKTOP-3PUM1GH/192.168.1.131

        //3.根据域名返回 InetAddress对象, 比如 www.baidu.com 对应
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2 = " + host2);// www.baidu.com/14.215.177.39

        //4.通过 InetAddress 对象，获取对应的地址
        String hostAddress = host2.getHostAddress();//IP 14.215.177.39
        System.out.println("host2 对应的ip = " + hostAddress);//14.215.177.39

        //5.通过 InetAddress 对象，获取对应的主机名/或者的域名
        String hostName = host2.getHostName();
        System.out.println("host2 对应的主机名/域名 = " + hostName);//www.baidu.com

    }
}
