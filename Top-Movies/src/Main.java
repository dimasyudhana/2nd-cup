import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) throws Exception {
        
        String path = "/opt/java/java-module-programs/src/2nd-cup/Top-Movies/src/movies.txt";

        try {
            loadMovies(path);
            printStore();
            userInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userInput() {
        
        Scanner scan = new Scanner(System.in);

        String status = "continue";

        while (status.equals("continue")) {

            int choice = (promptChoice(scan));
            Movie movie = store.getMovie(choice);
            double rating = promptRating(scan, movie.getName());
            
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("Ubah rating film lain, type: 'continue': ");
            status = scan.next();

        }

        scan.close();
    
    };

    public static int promptChoice(Scanner scan) {

        while (true) {

            System.out.println("Pilih urutan 0-9");
            
            if (!scan.hasNextInt()) {
                scan.next();
                continue;
            }


            int choice = scan.nextInt();
            if (incorrectChoice(choice)) continue;
            else return choice;

        }

    }

    public static boolean incorrectChoice(int choice) {
        
        return choice < 0 || choice > 9;
    
    }

    public static double promptRating(Scanner scan, String name) {
        
        while (true) {

            System.out.println("\nUbah rating baru untuk film "+ name +": ");
            
            if (!scan.hasNextDouble()) {
                scan.next();
                continue;
            }
            
            double rating = scan.nextDouble();
            if (incorrectRating(rating)) {
                System.out.println("Rating tidak sesaui. Contoh: 9.5"); 
                continue;
            }
            else return rating;
            
        }
        
    }

    public static boolean incorrectRating(double rating) {
        
        return rating < 0 || rating > 10;
    
    }

    public static void loadMovies(String fileName) throws FileNotFoundException {
        
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scan = new Scanner(fis);

        while (scan.hasNextLine()) {
            
            String line = scan.nextLine();
            String[] words = line.split("--");
            store.addMovie(new Movie(words[0],words[1],Double.parseDouble(words[2])));
        
        }

        scan.close();
    
    }

    public static void printStore() {
        System.out.println(" ***** TOKO FILM ***** ");
        System.out.println(store);
    }
}
