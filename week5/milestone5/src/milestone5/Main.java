package milestone5;
public class Main {

    public static void main(String[] args) {
    	StoreFront store = new StoreFront();
		//initialize the store 
		store.initializeStore();
		// create an object user 
		User user = new User (store); 
		// the user will interact with the store 1
		user.interact();
        
    }
}
