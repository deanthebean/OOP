import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Purchase {
    private List<Product> ProductList;
    private float TotalPrice;
    private LocalDateTime PurchaseDate;

    public void AddProductToPurchase(Product product) {
        ProductList.add(product);
    }

    public float CalculateTotalPrice() {
        for (Product product : ProductList) {
            this.TotalPrice += product.getProductPrice();
        }
        return this.TotalPrice;
    }

    public void Pay(){
        Scanner userPrompt  = new Scanner(System.in);
        System.out.println("Please pay the following amount: " + this.CalculateTotalPrice());
        System.out.println("Press enter to confirm.");
        userPrompt.nextLine();
        this.PrintReceipt();
    }

    private void PrintReceipt(){
        System.out.println("The following products were purchased: ");
        for (Product product : ProductList) {
            System.out.println(product.getProductName() + " " + product.getProductPrice());
        }
        System.out.println("Total Price: " + this.TotalPrice);
    }
}
