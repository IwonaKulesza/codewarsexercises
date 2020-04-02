import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {

     int h = 0;
     int m =0;
     int s = seconds;

        while (s >= 60) {
            m++;
            s=  s - 60;
        }
        while (m>=60){
            h++;
            m= m-60;
        }

        String string = String.format("%02d:%02d:%02d",h,m,s);

return string;

    }
}