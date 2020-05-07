import java.util.HashMap;
import java.util.Map;



public class Tour {

    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {

        HashMap<String, Double> friends = new HashMap<>();
        for (String[] tw:ftwns) {

            if (!tw[1].equals("")){
                System.out.println(tw[0]);
                System.out.println(h.get(tw[1]));
                friends.put(tw[0],h.get(tw[1]));
            }

        }

        String partOne = arrFriends[0];
        String partTwo = arrFriends[arrFriends.length-1];
        double result = friends.get(partOne)+friends.get(partTwo);
        Tour tour = new Tour();

        for (int i = 0; i<arrFriends.length-1; i++){
            result += tour.triangleA(friends.get(arrFriends[i]),friends.get(arrFriends[i+1]));
        }


        return (int) Math.floor(result);
    }

    public Double triangleA(Double x, Double y){
         Double b;
         Double c;
     if (x>y){
         b=y;
         c=x;
     }else {
         b=x;
         c=y;
     }
         return Math.sqrt(Math.pow(c,2)-Math.pow(b,2));
     }
}
