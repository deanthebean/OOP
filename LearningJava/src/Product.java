public class Product {
    private final int ProductId;
    private String ProductName;
    private double ProductPrice;

    public Product(int productId, String productName, double productPrice) {
        this.ProductId = productId;
        this.ProductName = productName;
        this.ProductPrice = productPrice;
    }

    public int getProductId(){
        return ProductId;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }
}
