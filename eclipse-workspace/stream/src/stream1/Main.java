package stream1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Leo", "Vijay", "2023"));
        list.add(new Movie("Jailer", "Rajini", "2023"));
        list.add(new Movie("Varisu", "Vijay", "2023"));
        
        System.out.println("All Movies:");
        list.forEach(System.out::println);
        
        System.out.println("\nVijay Movies mattum:");
        list.stream()
            .filter(m -> m.getHero().equals("Vijay"))
            .forEach(System.out::println);
    }
}