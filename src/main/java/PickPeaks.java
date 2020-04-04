import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PickPeaks {

    public static Map<String,List<Integer>> getPeaks(int[] arr) {

        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();


        if (arr.length>1) {
            int currentPeak =0;
            int currentPos = 0;
            for (int i = 1; i < arr.length - 1; i++) {

                int middle = arr[i];
                int next = arr[i+1];
                int prev = arr[i-1];



                if (prev< middle && next <= middle) {
                   currentPeak = middle;
                   currentPos = i;
                }

                if (prev<=middle && next<middle && currentPeak==middle) {
                    pos.add(currentPos);
                    peaks.add(currentPeak);
                }
            }


        }
        map.put("pos", pos);
        map.put("peaks", peaks);
        return map;
    }
}