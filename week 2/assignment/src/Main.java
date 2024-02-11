
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreFront store = new StoreFront(); 
		store.initializeStore();
		User user = new User (store); 
		
		user.intercat();
		

	}

}
