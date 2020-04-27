import java.util.Arrays;

public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {

        System.out.println(number+" "+ (number+1)+" "+(number+2));
        for (int ap:awesomePhrases
             ) {
            System.out.println(ap);

        }

        CarMileage cm = new CarMileage();
        if ((number>99)&&(cm.interest(number, awesomePhrases))){
            System.out.println("2!");
            return 2;
        }else if ((number>97)&&(cm.interest(number+1,awesomePhrases)||cm.interest(number+2,awesomePhrases))){
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
        System.out.println("Big num");
        return String.valueOf(i).matches("^\\d0+$");
    }
    private boolean sameNumber(int i){
        System.out.println("monotone");
        return  String.valueOf(i).matches("^(.)\\1*$");

    }
    private boolean increments (int i){
        String string = String.valueOf(i);

        for (int x = 1; x < string.length(); x++){

            int a = Character.getNumericValue(string.charAt(x-1));
            int b = Character.getNumericValue(string.charAt(x));
            if (b == 0){
                b = 10;
            }
            if ((a+1!=b)){
                return false;
            }
        }
        System.out.println("inc");
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
        System.out.println("dec");
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
        System.out.println(i);
        System.out.println("palindrome"+(temp == sum));
        return (temp == sum);
    }
    private boolean phrases(int i, int arr[]){
        return Arrays.stream(arr).anyMatch(x -> x == i);
    }



}
//    public static boolean isReallyInteresting(int number, final int[] awesomePhrases) {
//        return Stream.<Predicate<String>>of(
//                s -> s.matches("\\d0+"),
//                s -> new StringBuilder(s).reverse().toString().equals(s),
//                s -> "1234567890".contains(s),
//                s -> "9876543210".contains(s),
//                s -> Arrays.stream(awesomePhrases).anyMatch(n -> parseInt(s) == n)
//        ).anyMatch( p -> number > 99 && p.test(Integer.toString(number)));
//    }
//
//    public static int isInteresting(int number, int[] awesomePhrases) {
//        return isReallyInteresting(number, awesomePhrases) ? 2 :
//                isReallyInteresting(number + 1, awesomePhrases) ? 1 :
//                        isReallyInteresting(number + 2, awesomePhrases) ? 1 : 0;
//    }