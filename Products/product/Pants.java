package Products.product;

public class Pants extends Product {

    private int waist;
    private int length;

    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("  Pegang celana dalam posisi tegak");
        System.out.println("  Lipat salah satu kaki celana di atas yang lain");
        System.out.println("  Lipat celana dari bawah menjadi tiga bagian");
    }

    @Override
    public void wear() {
        System.out.println("celana ukuran " + this.waist + " " + this.length + " keliatan oke");
    }

}
