import java.util.TreeSet;

class NextBiggerNumber {


    static long nextBiggerNumber(long n) {
        String cyfra = Long.toString(n);
        NextBiggerNumber nextBiggerNumber = new NextBiggerNumber();
        TreeSet<Long> treeSet = new TreeSet<>();
        nextBiggerNumber.permute(cyfra,0,cyfra.length()-1,treeSet);
        for (Long l:treeSet) {
            if (l>n){
                n = l;
                break;
            }
        }

        return n;
    }



    void permute(String str, int l, int r, TreeSet<Long>treeSet) {

        if (l == r){
            treeSet.add(Long.parseLong(str));
            }
        else{
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r,treeSet);
                str = swap(str,l,i);
            }
        }
    }

    private String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}