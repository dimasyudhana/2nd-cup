package Products.product;

public class Shirt extends Product {

    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("  Letakkan kemeja di permukaan yang rata");
        System.out.println("  Lipat kemeja ke samping");
        System.out.println("  Masukkan lengan ke dalam");
        System.out.println("  Lipat dari bawah ke atas");        
    }

    @Override
    public void wear() {
        System.out.println("baju ukuran " + this.size + " pas untukmu.");
    }

}
