public class Square {
    public static boolean isSquare(int n) {

        if(n<0){
            return false;
        }else {
            double sq = Math.sqrt(n);
           return ((sq - Math.floor(sq))==0) ;
        }
    }
}