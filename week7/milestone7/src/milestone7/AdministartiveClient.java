package milestone7;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class AdministartiveClient {
	// client
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public static void main(String[] args) {
        AdministartiveClient client = new AdministartiveClient();
        try {
        	// build connection on this port 
            client.connect("127.0.0.1", 6666);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String command;
            while (true) {
                System.out.println("Enter the command (U for update, R for retrieve, Q for quit):");
                // read the command
                command = userInput.readLine();

                if ("U".equalsIgnoreCase(command)) {
                    // Prompt the user to enter product details
                    System.out.println("Enter product name:");
                    String name = userInput.readLine();
                    System.out.println("Enter product description:");
                    String description = userInput.readLine();
                    System.out.println("Enter product price:");
                    double price = Double.parseDouble(userInput.readLine());
                    System.out.println("Enter product quantity:");
                    int quantity = Integer.parseInt(userInput.readLine());

                    // Construct JSON data
                    String jsonData = "{\"name\":\"" + name + "\",\"description\":\"" + description + "\",\"price\":" + price + ",\"quantity\":" + quantity + "}";

                    client.sendUpdateCommand(jsonData);
                } else if ("R".equalsIgnoreCase(command)) {
                    // Send retrieve command
                    String response = client.sendRetrieveCommand();
                    System.out.println("Server response: " + response);
                } else if ("Q".equalsIgnoreCase(command)) {
                    // Quit the loop
                    break;
                } else {
                    System.out.println("Invalid command. Please enter either U, R, or Q.");
                }
            }

            client.cleanup();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void connect(String ip, int port) throws UnknownHostException, IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void sendUpdateCommand(String jsonData) throws IOException {
        out.println("U"); // Send command
        out.println(jsonData); // Send JSON data payload
        
    }

    public String sendRetrieveCommand() throws IOException {
    	out.println("R"); // Send command
        StringBuilder responseBuilder = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) { // Read until null (end of stream)
            if (line.equals("END")) { 
                break;
            }
            responseBuilder.append(line).append("\n");
        }
      // Trim the response to remove extra new line
        return responseBuilder.toString().trim(); 
    }
    
 // cleanup RR
    
    public void cleanup() throws IOException {
    	
        in.close();
        out.close();
        clientSocket.close();
    }
}



