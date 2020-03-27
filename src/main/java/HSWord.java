import java.util.HashMap;
import java.util.Map;

public class HSWord {

        public static String high(String s) {

            String[] words = s.split("\\s+");
            String highestScoringWord ="";
            int highestScore = 0;

            for (String currentWord:words) {
                int score = 0;
                for (char ch:currentWord.toCharArray()){
                    score = score+(ch - 'a' + 1);
                }
         if (score>highestScore){
             highestScore = score;
             highestScoringWord = currentWord;
         }
                
            }

            return highestScoringWord;
        }

    }
