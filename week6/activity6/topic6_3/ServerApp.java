package topic6_3;


public class ServerApp {
    public static void main(String[] args) {
        ServerThread serverThread = new ServerThread();
        serverThread.start();

        // Print dots while the server thread is still running
        while (serverThread.isAlive()) {
            System.out.print(".");
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
