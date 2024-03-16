package topic6_3;

import java.io.IOException;

public class ServerThread extends Thread {
	
	public void run() {
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
