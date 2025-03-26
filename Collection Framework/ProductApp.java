import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductApp {
	static Scanner sc;
	static ArrayList<Product> productlist ;
	
	public static void addProduct() {
		int id, stock;
		String name, category;
		double price;
		
		System.out.println("Enter the product id: ");
		id=sc.nextInt();
		
		System.out.println("Enter the product name: ");
		name=sc.next();
		
		System.out.println("Enter the product category: ");
		category=sc.next();
		
		System.out.println("Enter the product price: ");
		price=sc.nextDouble();
		
		System.out.println("Enter the product stock: ");
		stock=sc.nextInt();
		
		Product p1 = new Product(id,name,category,price,stock);
		productlist.add(p1);
		System.out.println("Product Added Successfully! ");
		System.out.println();
			
	}
	
	public static void main(String[] args) {
		int opt = 0;
		productlist = new ArrayList();
		sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Add a product name.");
			System.out.println("2. Display product datails. ");
			System.out.println("3. Delete any product.");
			System.out.println("4. Update product details.");
			System.out.println("5. Check stock availability for any product.");
			System.out.println("6. Applied discount on product.");
			System.out.println("7. Sort product by price.");
			System.out.println("8. Search product by name.");
			System.out.println("9. Exit");
			System.out.println("Enter your option: ");
			opt=sc.nextInt();
			
			switch(opt) {
				case 1 : addProduct();
						break;		
				case 2 : displayProductDetails();
				         break;
				case 3 : deleteProduct();
						break;
				case 4 : updateProduct();
						break;
				case 5 : checkStock();
						break;
				case 6 : applyDiscount();
						break;
				case 7 : sortProductByPrice();
						break;
				case 8 : searchProductByName();
						break;
				
				//default : System.out.println("Option Is incorrect!");		
			}
		}while(opt!=9) ;
	}

	private static void searchProductByName() {
		System.out.println("Enter Category to search product: ");
		String category = sc.next();
		for(Product pr : productlist) {
			if(pr.getCategory().toLowerCase().contains(category)) {
				System.out.println("Product Found: "+pr);
				System.out.println();
			}
		}
		
	}

	private static void sortProductByPrice() {
		Collections.sort(productlist);
		for(Product p : productlist ) {
			System.out.println(p);
			System.out.println();
		}		
	}

	private static void applyDiscount() {
		System.out.println("Enter Product Name to see discount: ");
		sc.nextLine();
		String name = sc.nextLine().toLowerCase();
		
		//System.out.println("Enter discount percentage: ");
		//double discount = sc.nextDouble();
		for (Product p : productlist) {
	        if (p.getName().toLowerCase().contains(name)) { 
	            double oldprice = p.getPrice();
	            double newprice = oldprice - (oldprice * 5 / 100);
	            p.setPrice(newprice);
	            System.out.println("Discount applied 5% on " + p.getName() + "!!" + "\n New Price: Rs." + newprice); 
	            System.out.println();
	        }
	    }
	}

	private static void updateProduct() {
		System.out.print("Enter Product ID to Update: ");
        int id = sc.nextInt();
        
        for(Product p : productlist) {
        	if(p.getId() == id) {
        		System.out.println(" Current Details : ");
        		System.out.println(p.getId() + " | " + p.getName() + " | " + p.getCategory() + " | Rs." + p.getPrice() + " | Stock: " + p.getStock());

        		
        		System.out.println("Enter new price: ");
        		p.setPrice(sc.nextDouble());
        		sc.nextLine();
        		
        		System.out.println("Enter new stock quantity: ");
        		p.setStock(sc.nextInt());
        		sc.nextLine();
        		
        		System.out.print("Enter New Category: ");
                p.setCategory(sc.nextLine());

                System.out.println("\n Product Updated Successfully!");
        	}
        	System.out.println(" Product Not Found! ");	
        }
	}
	
	
	private static void displayProductDetails() {
		System.out.println("\n ID     Name        Category           Price    Stock");
	    System.out.println("---------------------------------------------------------");

	    for (Product p : productlist) {
	        System.out.printf("%-7d %-12s %-15s Rs.%-8.2f %-6d%n",
	                p.getId(), p.getName(), p.getCategory(), p.getPrice(), p.getStock());
	        System.out.println();
	    }
	}

	private static void checkStock() {
		System.out.print("Enter Product ID to Check Stock: ");
        int id = sc.nextInt();

        for (Product p : productlist) {
            if (p.getId() == id) {
                System.out.println(" Available Stock: " + p.getStock());
                return;
            }
        }
        System.out.println(" Product Not Found!");
        System.out.println();
		
	}

	private static void deleteProduct() {
		System.out.print("Enter Product ID to Delete: ");
        int id = sc.nextInt();

        for (Product p : productlist) {
            if (p.getId() == id) {
                productlist.remove(p);
                System.out.println("Product Deleted Successfully!");
                return;
            }
        }
        System.out.println(" Product Not Found!");
        System.out.println();
    }
	
		
}


