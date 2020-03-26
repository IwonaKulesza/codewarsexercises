
public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        int sn =0;
        int we =0;

        for (char kierunek:walk) {
            switch (kierunek){
                case 's': sn++;
                    break;
                case 'n': sn--;
                    break;
                case 'w': we++;
                    break;
                case 'e': we--;
                    break;
            }
        }


        return sn==0&&we==0&&walk.length==10;
    }
}