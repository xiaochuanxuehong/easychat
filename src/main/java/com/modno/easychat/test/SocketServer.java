package com.modno.easychat.test;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;


public class SocketServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        try{
            server = new ServerSocket(1024);
            System.out.println("Socket测试服务启动，等待连接");
            Socket socket = server.accept();
            String ip = socket.getInetAddress().getHostAddress();
            System.out.println("客户端"+ip+":"+socket.getPort()+"已连接");

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String readDate = bufferedReader.readLine();
            System.out.println("收到客户端信息："+readDate);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
