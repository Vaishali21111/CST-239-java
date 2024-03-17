package milestone6;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class AdministrativeService extends Thread {
    private ServerSocket serverSocket;
    private boolean isRunning;

    @Override
    public void run() {
        isRunning = true;

        try {
        	
        	// Lauch a server socket on port 6666
            serverSocket = new ServerSocket(6666);
            System.out.println("Administrative Service is running on port 6666");

            while (isRunning) {
            	// waiting for client connection and accept it if received 
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected to Admin User");
                
                //Declaring printwriter and buffereREader
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String command;
                // Read command
                while ((command = in.readLine()) != null) {
                    System.out.println("Received command from Admin User: " + command);

                    switch (command) {
                    //if command =U then update the products.json file 
                        case "U":
                            handleUpdateCommand(in, out);
                            break;
                        case "R":
                      // if commands = R then retrieve the products from the file
                            handleRetrieveCommand(out);
                            break;
                        case "QUIT":
                       // if quit then quit and clean up 
                            cleanup(out, in, clientSocket);
                            return; 
                        default:
                            out.println("Invalid command");
                            break;
                    }
                }

                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void handleUpdateCommand(BufferedReader in, PrintWriter out) throws IOException {
    // Read JSON data from the client
    StringBuilder jsonBuilder = new StringBuilder();
    String line;
    while ((line = in.readLine()) != null && !line.isEmpty()) {
        jsonBuilder.append(line);
    }
    String jsonData = jsonBuilder.toString();

    // Update products.json file by adding new products
    updateProductsFile(jsonData, out);

}

    private void updateProductsFile(String jsonData, PrintWriter out) {
        try (FileWriter writer = new FileWriter("products.json", true)) {
            writer.write(jsonData);
            writer.write("\n");
            out.println("Products updated successfully"); // Send success message to client
          
        } catch (IOException e) {
            e.printStackTrace();
            out.println("Failed to update products: " + e.getMessage()); // Send error message to client
          
        }
    }

   

    private void handleRetrieveCommand(PrintWriter out) throws IOException {
        // Read products from products.json file
        String productsJson = readProductsFromFile("products.json");

        // Send the products back to the client
        out.println(productsJson);
        out.println("END");
    }

    private String readProductsFromFile(String filename) {
    	// read the products line by line 
        StringBuilder productsJson = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                productsJson.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productsJson.toString();
    }

    public void cleanup(PrintWriter out, BufferedReader in, Socket clientSocket) throws IOException {
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
        isRunning = false;
    }

    public static void main(String[] args) {
        AdministrativeService server = new AdministrativeService();
        server.start();
    }
}


