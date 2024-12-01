public class Movie {
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie src) {
        this.name = src.name;
        this.format = src.format;
        this.rating = src.rating;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("nama tidak boleh kosong");
        }

        this.name = name;
    
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {

        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("format tidak boleh kosong");
        }

        this.format = format;
    
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {

        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("rating tidak sesuai");
        }

        this.rating = rating;
    
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

}
