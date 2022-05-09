

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Studente
 */
public class Clientsocket {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
      
        

        try{
       
        Socket socket = new Socket("127.0.0.1",2200);

        socket.close();
    
        }catch(IOException e){
     
    System.err.println("errore in chiusura: "+e);
    }
        
        }
    
}