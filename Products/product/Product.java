package Products.product;

public abstract class Product {
    
    private double price;
    private String color;
    private String brand;

    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public Product(Product src) {
        this.price = src.price;
        this.color = src.color;
        this.brand = src.brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void fold() {
        System.out.println("\nMembungkus " + this.getBrand() + " " + this.getClass().getSimpleName());
    }

    public abstract void wear();

}
