public class Store {
    
    private Movie[] movies;

    public Store() {
        this.movies = new Movie[5];
    };

    public Movie getMovie(int idx) {
        return new Movie(this.movies[idx]);
    }

    public void setMovie(int idx, Movie movie) {
        this.movies[idx] = new Movie(movie);
    }

    public String toString() {
        String tmp = "";
        for (Movie movie : movies) {
            tmp += movie.toString() + "\n";
        }
        return tmp;
    }

}
