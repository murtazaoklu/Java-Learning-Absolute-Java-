/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Tosun Pasha
 */
public class Message implements java.io.Serializable {

    /**
     * @param args the command line arguments
     */
    public String theMessage;
    public Message(String _msg){
        theMessage = _msg;
    }
    
}
