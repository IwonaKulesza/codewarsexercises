import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpinWords {

    public String spinWords(String sentence) {
        Pattern pattern = Pattern.compile("(\\s*)([A-z]{5,})(\\s*)");
        String spinned = "";
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            String reversedWord = reverse(matcher.group(2));

            sentence = sentence.replaceAll(matcher.group(2), reversedWord);
        }
        return sentence;
    }

    public String reverse(String word){
        String reverse = "";
        for(int i = word.length() - 1; i >= 0; i--)
        {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }

}