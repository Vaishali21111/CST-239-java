
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreFront store = new StoreFront(); 
		
		//initialize the store 
		store.initializeStore();
		
		// constructor of the product : name ,description, price , quantity 
		SalableProduct product1 =new SalableProduct("Product1" ,"This is my product 1" , 12, 1000);
		SalableProduct product2 =new SalableProduct("Product2" ,"This is my product 2" , 15, 2000); 
		
		//purchasing products 
		store.purchaseProduct(product1, 100);
		store.purchaseProduct(product2, 300);
		
		//Canceling the purchase 
		store.CancelPurchaseProduct(product2, 100);
		
		//Do the checkout 
		System.out.println("Total of my purchase are "+ store.checkout());

	}

}
