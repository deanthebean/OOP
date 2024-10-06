import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int ProductCount;
    private List<Product> AvailableProducts;

    public Inventory() {
        this.ProductCount = 0;
        this.AvailableProducts = new ArrayList<Product>() {};
    }

    public void AddProduct(String productName, double productPrice) {
        AvailableProducts.add(new Product(ProductCount, productName, productPrice));
        ProductCount++;
    }

    public void ParseProducts(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("resources/products.json"));
            //Product product = new Gson().fromJson(br, Product.class);
            //AddProduct();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void PrintAvailableProducts() {
        System.out.println(String.format("%-30s", "Product") + "Price");
        System.out.println(String.format("%" + (30 + "Price".length()) + "s", "").replace(' ', '_'));
        for (Product product : AvailableProducts) {
            System.out.println(String.format("%-30s", product.getProductName()) + String.format("%" + "Price".length() + "s", product.getProductPrice()));
        }
    }

    public Product GetProductById(int productId){
        return AvailableProducts.stream().filter(product -> product.getProductId() == productId).findFirst().get();
    }
}
