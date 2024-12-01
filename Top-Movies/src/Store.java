import java.util.ArrayList;
import java.util.List;

public class Store {
    
    private List<Movie> movies;

    public Store() {
        this.movies = new ArrayList<>();
    };

    public Movie getMovie(int idx) {
        return new Movie(this.movies.get(idx));
    }

    public void setMovie(int idx, Movie movie) {
        this.movies.set(idx, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public String toString() {
        String tmp = "";
        for (Movie movie : movies) {
            tmp += movie.toString() + "\n";
        }
        return tmp;
    }

}
