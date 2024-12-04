package model;

import java.util.List;

public class Movie {

    private int id;
    private String title;
    private String year;
    private int runtime;
    private List<String> genres;
    private String director;
    private String actors;
    private String plot;
    private String postUrl;

    public Movie(int id, String title, String year, int runtime, List<String> genres, String director, String actors, String plot, String postUrl) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.runtime = runtime;
        this.genres = genres;
        this.director = director;
        this.actors = actors;
        this.plot = plot;
        this.postUrl = postUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    @Override
    public String toString() {
        return "Film: " + title + " (" + year + ")\n"
            + "Disutradarai oleh: " + director + "\n"
            + "Durasi: " + runtime + " menit\n"
            + "Genre: " + String.join(", ", genres) + "\n"
            + "Pemeran: " + actors + "\n"
            + "Sinopsis: " + plot + "\n"
            + "Poster: " + postUrl;
    }
    
}
