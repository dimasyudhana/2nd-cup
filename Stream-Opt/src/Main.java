import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // higher order func rather than imperative func
        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 100.58, 99.0, 490.43, 396.19, 500.00);
        prices.stream()
            .filter(price -> price > 100)
            .map(price -> price - 20)
            .sorted((x,y) -> x.compareTo(y))
            .map(price -> "IDR " + price)
            .forEach(price -> System.out.println(price));

        System.out.println();

        List<String> xyz = Arrays.asList("xxxxxx","yyyyyy","zzzzzz");
        String result = xyz.stream()
            .filter(xy -> xy.equals("zzzzzz"))
            .findFirst()
            .orElse(null);

        String resp = result == null ? "tidak ada" : "ada";

        System.out.println(resp);

        System.out.println();

        List<Integer> nums = Arrays.asList(1,1,1,2,2,1,1,2,2,1,2,2,3,4,1);
        System.out.println("banyak perulangan angka 1 ?");

        long counted = nums.stream()
            .filter(num -> num == 1)
            .count();


        System.out.println("angka 1 diulang sebanyak " + counted + " kali.");

        System.out.println();

        try {
            Path path = Paths.get("Stream-Opt/src/chorus.txt");
            Files.lines(path).forEach(row -> System.out.println(row));
        } catch (IOException err) {
            System.out.println(err);
        }

        System.out.println();

    }
}
