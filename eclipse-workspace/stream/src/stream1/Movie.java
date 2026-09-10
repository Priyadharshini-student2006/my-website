package stream1;

public class Movie {
    String title;
    String hero;
    String year;
    
    public Movie(String title, String hero, String year) {
        this.title = title;
        this.hero = hero;
        this.year = year;
    }
    
    public String getHero() {
        return hero;
    }
    
    public String toString() {
        return title + " - " + hero + " - " + year;
    }
}