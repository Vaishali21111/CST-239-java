package topic6_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create a client and connect to the remote server on the specified IP address and port
        Client client = new Client();
        client.start("127.0.0.1", 6666);

        // Send 10 Messages to the server
        String response;
        for (int count = 0; count < 10; ++count) {
            // Send Message to the server and on the 9th one send a shutdown command to server
            String message;
            if (count != 9) {
                message = "Hello from client " + count;
            } else {
                message = ".";
            }
            response = client.sendMessage(message);
            // Print out the server Response and if we get a quit response exit this program
            System.out.println("Server response was: " + response);
            if ("QUIT".equals(response)) {
                break;
            }
        }
        client.cleanup();
    }

    /**
     * Start method for the server application.
     *
     * @param ip   IP address of the server
     * @param port Port number to connect to
     * @throws UnknownHostException If the IP address of the host could not be determined.
     * @throws IOException          If an I/O error occurs when creating the socket or input/output streams.
     */
    public void start(String ip, int port) throws UnknownHostException, IOException {
        // Connect to the Remote server on the specified IP address and Port
        clientSocket = new Socket(ip, port);

        // Create some input and output network buffers to communicate back and forth with the server
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    /**
     * Send a message to the server.
     *
     * @param msg Message to send.
     * @return Response back from the server
     * @throws IOException thrown if anything bad happens from any of the networking classes
     */
    public String sendMessage(String msg) throws IOException {
        // Send/print a message to server with a terminating line feed
        out.println(msg);

        // Return the response from the server
        return in.readLine();
    }

    /**
     * Cleanup logic to close all the network connections.
     *
     * @throws IOException thrown if anything bad happens from the networking classes.
     */
    public void cleanup() throws IOException {
        // Close all input and output network buffers and sockets
        in.close();
        out.close();
        clientSocket.close();
    }
}
