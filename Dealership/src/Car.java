import java.util.Arrays;

public class Car {

    private String make;
    private double price;
    private String year;
    private String color;
    private boolean status;
    private String[] parts;

    // arrays : mutable objects -> referencing & dereferencing  
    public Car(String make, double price, String year, String color, boolean status, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.status = status;
        this.parts = Arrays.copyOf(parts, parts.length); 
    }

    public Car(Car src) {
        this.make = src.make;
        this.price = src.price;
        this.year = src.year;
        this.color = src.color;
        this.status = src.status;
        this.parts = Arrays.copyOf(src.parts, src.parts.length);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts,this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive() {
        
        String status = null;

        int year = Integer.parseInt(this.year);
        
        if (!this.status && year <= 2020) {
            status = "Bekas";
        } else {
            status = "Baru";
        }
        
        System.out.println("Anda sudah membeli " + this.make + " " + this.color + " " + this.year + " " + status + " dengan harga IDR " + this.price + ".");
        System.out.println("Terimakasih, pintu keluar sebelah timur.\n");
    
    }

    public String toString() {
        return "Merek: " + this.make + ".\n"
            + "Harga: " + this.price + ".\n"
            + "Tahun: " + this.year + ".\n"
            + "Warna: " + this.color + ".\n"
            + "Suku cadang: " + Arrays.toString(parts) + ".\n";
    }

}
