import model.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.addGenre("Comedy");
        movieStore.addGenre("Adventure");

        Movie movie1 = new Movie(1, "Beetlejuice", "1988", 92,
                Arrays.asList("Comedy", "Fantasy"), "Tim Burton",
                "Alec Baldwin, Geena Davis, Annie McEnroe, Maurice Page",
                "A couple of recently deceased ghosts contract the services of a \"bio-exorcist\" in order to remove the obnoxious new owners of their house.",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTUwODE3MDE0MV5BMl5BanBnXkFtZTgwNTk1MjI4MzE@._V1_SX300.jpg");

        Movie movie2 = new Movie(
                    4,
                    "Warkop DKI Reborn",
                    "2016",
                    95,
                    Arrays.asList("Comedy"),
                    "Anggy Umbara",
                    "Abimana Aryasatya, Vino G. Bastian, Tora Sudiro",
                    "Petualangan lucu Dono, Kasino, dan Indro dalam melunasi utang negara yang melibatkan mafia.",
                    "https://upload.wikimedia.org/wikipedia/id/a/a4/Warkop_DKI_Reborn_Poster.jpg"
            );

        Movie movie3 = new Movie(3, "Crocodile Dundee", "1986", 97,
                Arrays.asList("Adventure", "Comedy"), "Peter Faiman",
                "Paul Hogan, Linda Kozlowski, John Meillon, David Gulpilil",
                "An American reporter goes to the Australian outback to meet an eccentric crocodile poacher and invites him to New York City.",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTg0MTU1MTg4NF5BMl5BanBnXkFtZTgwMDgzNzYxMTE@._V1_SX300.jpg");

        movieStore.addMovie(movie1);
        movieStore.addMovie(movie2);
        movieStore.addMovie(movie3);

        System.out.println("Daftar Film:");
        movieStore.getMovies().forEach(System.out::println);

        String genreToFilter = "Comedy";
        System.out.println("\nFilm dengan genre '" + genreToFilter + "':");
        List<Movie> filteredMovies = movieStore.filterByGenre(genreToFilter);
        filteredMovies.forEach(System.out::println);

        System.out.println("\nFilm yang diurutkan berdasarkan tahun rilis:");
        List<Movie> sortedMovies = movieStore.sortMoviesByReleaseYear();
        sortedMovies.forEach(System.out::println);
    }
}
