import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TopWords {

    public static List<String> top3(String s) {

        System.out.println(s.toLowerCase());
        s=s.replace('_',' ').toLowerCase();

        Pattern pattern = Pattern.compile("\\b[a-z'?a-z]+\\b");
        Matcher matcher = pattern.matcher(s);

        String word1, word2, word3;
        long word1count, word2count, word3count;

        word1 = word2 = word3 = "";
        word1count = word3count =word2count = 0;

        while (matcher.find()){
            String word = matcher.group(0);
            System.out.println(word);
            String pat = "(\\b)"+word+"(\\b)";
            Pattern pattern1 = Pattern.compile(pat);

            Matcher matcher1 = pattern1.matcher(s);
            long matches = matcher1.results().count();
            s = s.replaceAll(pat," ");
            System.out.println(word+" = "+matches);
            if (matches>word1count){
                word3count = word2count;
                word2count = word1count;
                word3 = word2;
                word2=word1;
                word1count = matches;
                word1 = word;
            } else if (matches>word2count){
                word3 =word2;
                word3count =word2count;
                word2 = word;
                word2count = matches;
            } else if (matches>word3count){
                word3 = word;
                word3count = matches;
            }
        }
        List<String> list = new ArrayList<>();
        if (!word1.isEmpty()) {
            list.add(word1);
        }
        if (!word2.isEmpty()) {
            list.add(word2);
        }
        if (!word3.isEmpty()) {
            list.add(word3);
        }

        return list;
    }
}