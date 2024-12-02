package Products;

import Products.product.*;

public class Main {
    
    public static void main(String[] args) {

        // product disini secara specific apa
        // tambah abstract class jadi cannot instantiate the type product 
        // a class that cannot create objects from directly
        // Product product = new Product(null);

        Pants jeans = new Pants(29.99, "Black", "Levi's", 32, 34);
        jeans.fold();
        productStore(jeans);
        
        Shirt shirt = new Shirt(9.99, "Grey", "Nike", Shirt.Size.MEDIUM);
        shirt.fold();
        productStore(shirt);
    }

    public static void productStore(Product product) {
        System.out.println("Hatur nuhun ges membungkus " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + " total : IDR " + product.getPrice());
        
        // the object class is the root parent of all clasess in java
        product.wear(); 
    }
    
}
