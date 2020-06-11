package cn.lianxi;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InterAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        /*
            获取ip地址
        * */
        InetAddress add = InetAddress.getByName("zaneleo");
        String name = add.getHostAddress();
        String ip = add.getHostAddress();
        System.out.println("主机名："+name);
        System.out.println("IP地址："+ip);
    }
}
