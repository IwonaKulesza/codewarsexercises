import java.util.Arrays;

public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {

        System.out.println(number+" "+ (number+1)+" "+(number+2));
        for (int ap:awesomePhrases
             ) {
            System.out.println(ap);

        }

        if (number<98){
            return 0;
        }

        CarMileage cm = new CarMileage();
        if (cm.interest(number, awesomePhrases)){
            System.out.println("2!");
            return 2;
        }else if (cm.interest(number+1,awesomePhrases)||cm.interest(number+2,awesomePhrases)){
            System.out.println("1!");
            return 1;
        }else return 0;
            }

    private boolean interest(int i, int[]arr){return
            followedByZero(i)||
            sameNumber(i)||
            increments(i)||
            decrements(i)||
            palindrome(i)||
            phrases(i, arr);}

    private boolean followedByZero(int i){
        return String.valueOf(i).matches("^\\d0+$");
    }
    private boolean sameNumber(int i){
        return  String.valueOf(i).matches("^(.)\\1*$");

    }
    private boolean increments (int i){
        String string = String.valueOf(i);
        for (int x = 1; x < string.length()-1; x++){
            int a = Character.getNumericValue(string.charAt(x-1));
            int b = Character.getNumericValue(string.charAt(x));
            int c = Character.getNumericValue(string.charAt(x+1));
            if ((a+1!=b)||(b+1!=c)){
                return false;
            }
        }
        return true;
    }
    private boolean decrements (int i){
        String string = String.valueOf(i);
        for (int x = 1; x < string.length()-1; x++){
            int a = Character.getNumericValue(string.charAt(x-1));
            int b = Character.getNumericValue(string.charAt(x));
            int c = Character.getNumericValue(string.charAt(x+1));
            if ((a-1!=b)||(b-1!=c)){
                return false;
            }
        }
        return true;
    }
    private boolean palindrome (int i) {
        int r, sum = 0, temp;
        temp = i;
        while (i > 0) {
            r = i % 10;
            sum = (sum * 10) + r;
            i = i / 10;
        }
        return (temp == sum);
    }
    private boolean phrases(int i, int arr[]){
        return Arrays.stream(arr).anyMatch(x -> x == i);
    }



}