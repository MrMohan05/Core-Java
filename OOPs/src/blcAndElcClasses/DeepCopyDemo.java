package blcAndElcClasses;

public class DeepCopyDemo {
	
		public static void main(String[] args) 
		{
			Produc p1 = new Produc(111, "Laptop");
			
			Produc p2 = new Produc();
			p2.setProductId(p1.getProductId());
			p2.setProductName(p1.getProductName());
			
			System.out.println("Before Modification...");
			System.out.println(p1);
			System.out.println(p2);
			
			System.out.println("After Modification...");
			p2.setProductId(222);
			p2.setProductName("Camera");
			System.out.println(p1);
			System.out.println(p2);
			

		}

	
}
