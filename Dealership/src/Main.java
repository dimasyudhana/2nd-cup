import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
            new Car("Toyota",300,"2010", "Hitam", false, new String[] {"Tire, Filter Oli"}),
            new Car("Honda",310,"2022", "Merah", true, new String[] {"Battery, Engine"}),
            new Car("Mazda",500,"2024", "Putih", true, new String[] {"Kampas Kopling, Radiator"}),
        };

        boolean running = true;
        
        while (running) {

            Dealership dealership = new Dealership(cars);

            System.out.println("\n ***** JAVA DEALER ***** \n");
            System.out.println("Silahkan pilih koleksi mobil yang tersedia.\n");
            System.out.println(dealership);
            System.out.println("Tertarik dengan mobil yang mana? (1 - " + cars.length + "), atau 0 untuk keluar.\n");

            int idx = scan.nextInt();

            if (idx == 0) {
                System.out.println("Terima kasih telah mengunjungi JAVA DEALER. Sampai jumpa lagi!");
                System.exit(0);
            } else if (idx < 1 || idx > cars.length) {
                System.out.println("Out of range, silahkan pilih antara 1 hingga " + cars.length + ".");
            } else {
                dealership.sell(idx - 1);
            }

        }

        scan.close();
    }
}
