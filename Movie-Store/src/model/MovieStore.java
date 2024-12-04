package model;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore {

    private Set<String> genres;
    private List<Movie> movies;

    public MovieStore() {
        this.genres = new HashSet<>();
        this.movies = new ArrayList<>();
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        if (genres != null) {
            this.genres = genres;
        } else {
            throw new IllegalArgumentException("Genres tidak sesuai");
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        if (movies != null) {
            this.movies = movies;
        } else {
            throw new IllegalArgumentException("Movies tidak sesaui");
        }
    }

    public void addGenre(String genre) {
        if (genre != null && !genre.isBlank()) {
            genres.add(genre.trim());
        }
    }

    public void addMovie(Movie movie) {
        if (movie != null) {
            movies.add(movie);
            genres.addAll(movie.getGenres());
        }
    }

    public List<Movie> filterByGenre(String genre) {
        if (genre == null || genre.isBlank()) {
            return Collections.emptyList();
        }
        return movies.stream()
                .filter(movie -> movie.getGenres().stream()
                        .anyMatch(g -> g.equalsIgnoreCase(genre)))
                .collect(Collectors.toList());
    }

    public List<Movie> sortMoviesByReleaseYear() {
        return movies.stream()
                .sorted((movie1, movie2) -> {
                    try {
                        int year1 = Integer.parseInt(movie1.getYear());
                        int year2 = Integer.parseInt(movie2.getYear());
                        return Integer.compare(year1, year2);
                    } catch (NumberFormatException e) {
                        return 0;
                    }
                })
                .collect(Collectors.toList());
    }
    
}
