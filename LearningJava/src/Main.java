import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.ParseProducts();
        inv.AddProduct("Apple", 3.50);
        inv.AddProduct("Banana", 2.00);
        inv.AddProduct("Orange", 1.00);

        /*String jsonString = new Gson().toJson(inv);
        try {
            FileWriter myWriter = new FileWriter("resources/testproducts.json");
            myWriter.write(jsonString);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

        inv.PrintAvailableProducts();

    }
}
