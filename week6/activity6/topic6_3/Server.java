package topic6_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    /**
     * Start the server and wait for connections on the specified port.
     *
     * @param port Port to listen on
     * @throws IOException thrown in the networking classes if something bad happened.
     */
    public void start(int port) throws IOException {
        // Wait for a client connection
        System.out.println("Waiting for a client connection ...");
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();

        // If you get here then a client connected to this server so create some input and output network buffers
        System.out.println("Received a Client Connection on port " + clientSocket.getLocalPort());
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        // Wait for command (string that is terminated by a line feed character)
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            // If period command then shut the server down
            if (".".equals(inputLine)) {
                System.out.println("Got a message to shut the server down'");
                out.println("Quit");
                break;
            } else {
                // Echo an acknowledgement back to the client that command was processed successfully
                System.out.println("Got a message of: " + inputLine);
                out.println("OK");
            }
        }

        // Exit message that Server is shut down
        System.out.println("Server is shut down");
    }
    
    /**
     * Cleanup logic to close all the network connections. 
     * @throws IOException thrown if anything bad happens from the networking classes. 
     */ 
    
    public void cleanup() throws IOException {
    	// Close all input and output network buffers and sockets 
    	in.close();
    	out.close();
    	clientSocket.close();
    	serverSocket.close();}
    
    
    /**
     * * Entry method for the Server application (for testing only). 
     * @param args 
     * @throws IOException
     */
    
    public static void main (String[]args) throws IOException {
    	//create an instance of this server 
    	//start the server on port 6666 which will not return until the shutdown command is received 
    	// and then on exit clean everything up 
    	Server server = new Server();
    	try {
    	server.start(6666);
    	server.cleanup();
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }
    
}
