public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char ch:str.toCharArray())
            vowelsCount+=( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ?1:0;


            return vowelsCount;
    }

}