/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Tosun Pasha
 */
public class EchoClient {
    public static  void main(String[] args){
        try{
            String serverName;
            System.out.println("Enter  Server name or IP > \n");
            System.out.print(" > ");
            
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            serverName = in.readLine();
            
            final Socket sock = new Socket(serverName, EchoServer.SERVER_PORT);
            System.out.println("Connected to " + serverName + " on port " + 
                    EchoServer.SERVER_PORT);
            
            final ObjectOutputStream output = new ObjectOutputStream(sock.getOutputStream());
            final ObjectInputStream input = new ObjectInputStream(sock.getInputStream());
            
            Message msg = null, resp = null;
            do{
                msg = new Message(readSomeText());
                output.writeObject(msg);
                resp = (Message)input.readObject();
                System.out.println("\nServer says: " + resp.theMessage + "\n");
            }
            while(!msg.theMessage.toUpperCase().equals("EXIT"));
            sock.close();
        }
        catch(Exception e){
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
    private static String readSomeText(){
        try{
            System.out.println("Enter a aline of text, or type \"EXIT\" to quit.");
            System.out.print(" > ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            return in.readLine();
        }
        catch (Exception e){
            return "";
        }
    }
}
