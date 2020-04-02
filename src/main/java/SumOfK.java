import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfK {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        int best = 0;
        List<List<Integer>> proposition = new ArrayList<List<Integer>>();

        for (Integer integer:ls) {
            List<Integer> list = new ArrayList<>();
            list.add(integer);
            System.out.println("{");
            for (int i = 0; i<k;i++){
                for (Integer nextInt:ls) {
                    if (!list.contains(nextInt)){
                        list.add(nextInt);
                        System.out.println(nextInt);
                    }

                }
            }
            proposition.add(list);
        }
        System.out.println(proposition.size());
        for (List<Integer> list:proposition) {
            int sum = 0;
            for (Integer i:list) {
                sum = sum+i;
            }
            if (sum>best&&sum<=t){

                best = sum;
            }
        }
return best;


    }
}
