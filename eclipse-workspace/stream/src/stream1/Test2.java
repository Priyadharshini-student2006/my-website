package stream1;
import java.util.Arrays;  
import java.util.List;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Movie> Movies = Arrays.asList(
            new Movie("Basha", "rajinikanth", "1991"),
            new Movie("Thalapathy", "Rajini", "1991"),
            new Movie("Leo", "Vijay", "2023")
        );

        System.out.println(Movies);

        // Correct way - equalsIgnoreCase
        Stream<Movie> movieStream = Movies.stream();
        Stream<Movie> Moviefilter = movieStream.filter(m -> m.getHero().equalsIgnoreCase("rajinikanth"));
        Moviefilter.forEach(m -> System.out.println(m));

        System.out.println("--- Without ignore case ---");
        // Wrong way - == use panna varathu
        Stream<Movie> movieStream1 = Movies.stream();
        Stream<Movie> Moviefilter1 = movieStream1.filter(m -> m.getHero().equals("rajinikanth"));
        Moviefilter1.forEach(m -> System.out.println(m));
    }
}