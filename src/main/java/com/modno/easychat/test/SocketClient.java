package com.modno.easychat.test;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) {
        Socket socket =null;
        try{
            socket=new Socket("127.0.0.1",1024);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            printWriter.println(input);
            printWriter.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
