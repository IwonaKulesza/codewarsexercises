import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        String string = "";
        for (int i : binary) {
            string = string + i;
        }
        return Integer.parseInt(string, 2);
    }
}
