import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

       Stream.of(items)
               .skip(2)
               .limit(2)
               .findAny()
               .ifPresent(System.out::println);

        return null;
    }
}