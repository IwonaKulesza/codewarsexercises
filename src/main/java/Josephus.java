import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List temporaryList = new ArrayList<T>();
        List result = new ArrayList<T>();
        List list = items;

        while (list.size() >= k) {
            int listSize = list.size();

            System.out.println("list size " + listSize);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(" . "+i);
                if ((i + 1) % k == 0) {
                    result.add(list.get(i));
                    System.out.println("if item "+list.get(i));
                } else {
                    temporaryList.add(list.get(i));
                    System.out.println("else item "+list.get(i));
                }
            }
            list.clear();
            list.addAll(temporaryList);
            temporaryList.clear();
        }
        return result;
    }
}