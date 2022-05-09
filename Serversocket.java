        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Studte
 */
public class Serversocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    
        int port = 2200;
       
        Socket socket=null;
        try{     
            
             System.out.println("in attesa di connessione");
            
             
             ServerSocket serverr =new ServerSocket(port);
           

            socket=serverr.accept();
           
            
            System.out.println("connessione iniziata con "+socket.getRemoteSocketAddress());
            System.out.println("la porta è"+socket.getLocalPort());
        }


      
        catch(IOException ex){
            System.err.println("errore I/O");
        }

       
            
    }


}

