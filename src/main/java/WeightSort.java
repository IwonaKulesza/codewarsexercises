import java.util.*;

public class WeightSort {

    public static String orderWeight(String strng) {

        Map<Integer, List<String>> orderOfWeights = new TreeMap<>();
        WeightSort weightSort =  new WeightSort();

        for (String weight:strng.split("\\s")
             ) {
            orderOfWeights.computeIfAbsent(weightSort.newWeight(weight),k -> new ArrayList<>()).add(weight);
        }
        Set<Integer> keys = orderOfWeights.keySet();
        String newOrder = "";

        for (Integer key:keys) {
            List<String> list = orderOfWeights.get(key);
            Collections.sort(list);
            for (String weight:list
                 ) {newOrder = newOrder+" "+weight;

            }
        }

        return newOrder.trim();
    }


    Integer newWeight (String weight){
        Integer newWeight = 0;
        for (char number:weight.toCharArray())
        {
            newWeight += Character.getNumericValue(number);
        }
        System.out.println(weight+" "+newWeight);
        return newWeight;
    }
}