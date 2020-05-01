import java.util.ArrayList;
import java.util.List;

class Dinglemouse {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

    public static String[] flapDisplay(final String[] lines, final int[][] rotors) {

        List<Character> alph = new ArrayList<>();
        for (Character a:ALPHABET.toCharArray()) {
            alph.add(a);
        }
        int wordcount = 0;
        ArrayList<String> result = new ArrayList<String>();

        for (String line:lines) {
            String word = "";
            int sum = 0;

            for (int i = 0; i < line.length(); i++) {
                Character letter = line.charAt(i);
                System.out.println(letter);
                int number = rotors[wordcount][i];
                System.out.println(number);
                int startingNumber = alph.indexOf(letter);
                System.out.println(startingNumber);
                sum += number;
                System.out.println(sum);
                int startSum = startingNumber+sum;
                while (startSum>=alph.size()){
                    startSum-= alph.size();
                }
                word += alph.get(startSum);
            }
            result.add(word);
            wordcount++;

        }

               return result.toArray(new String[0]);
    }

}
