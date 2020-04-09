import java.util.TreeSet;

class NextBiggerNumber {

    static long nextBiggerNumber(long n) {
        String cyfra = Long.toString(n);
        NextBiggerNumber nextBiggerNumber = new NextBiggerNumber();

        System.out.println(cyfra.length()-2);

        for (int i = 0;i<=cyfra.length()-2;i++) {
            TreeSet<Long> treeSet = new TreeSet<>();
            int sizeOfChunk1 = 2+i;
            String chunk1 = cyfra.substring(cyfra.length() - sizeOfChunk1);
            String chunk2 = chunk1.substring(0, cyfra.length() - sizeOfChunk1);
            System.out.println("A"+chunk1+"B"+chunk2);
            nextBiggerNumber.permute(chunk1, chunk2,0, cyfra.length() - 1, treeSet);
            if (nextBiggerNumber.getNextBiggerNumber(treeSet,n) != null){
                return nextBiggerNumber.getNextBiggerNumber(treeSet,n);
            }
        }
        return n;
    }

    Long getNextBiggerNumber(TreeSet<Long>treeSet, Long n) {
        for (Long l : treeSet) {
            System.out.println("check: l "+ l+ " n " + n);
            if (l > n) {
                return l;
            }
        }
        return null;
    }

    void permute(String str,String chunk2, int l, int r, TreeSet<Long>treeSet) {

        if (l == r){
            treeSet.add(Long.parseLong(chunk2+str));
            System.out.println(chunk2+str);
            }
        else{
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, chunk2,l+1, r,treeSet);
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