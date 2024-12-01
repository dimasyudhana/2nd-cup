import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) throws Exception {
        
        Movie[] movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0)
        };

        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }

        printStore();
        userInput();

    }

    public static void userInput() {
        
        Scanner scan = new Scanner(System.in);

        String status = "continue";

        while (status.equals("continue")) {
            
            System.out.print("\nPilih no 0 - 4: ");
            int choice = scan.nextInt();
            Movie movie = store.getMovie(choice);
            System.out.print("\nUbah rating film " + movie.getName() + " dengan nilai baru: ");
            double rating = scan.nextDouble();
            movie.setRating(rating);
            store.setMovie(choice, movie);
            printStore();
            System.out.print("Ubah rating film lain, type: 'continue': ");
            status = scan.next();

        }

        scan.close();
    
    };

    public static void printStore() {
        System.out.println(" ***** TOKO FILM ***** ");
        System.out.println(store);
    }
}
