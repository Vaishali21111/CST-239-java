
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreFront store = new StoreFront(); 
		store.initializeStore();
		SalableProduct product1 =new SalableProduct("Product1" ,"This is my product 1" , 12, 1000);
		SalableProduct product2 =new SalableProduct("Product2" ,"This is my product 2" , 15, 2000); 
		
		store.purchaseProduct(product1, 100);
		store.purchaseProduct(product2, 300);
		store.CancelPurchaseProduct(product2, 100);
		System.out.println("Total of mu putchase are "+ store.checkout());

	}

}
