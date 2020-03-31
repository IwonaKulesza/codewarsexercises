class RevRot {

    public static String revRot(String strng, int sz) {

        if (sz<=0||strng.isEmpty()||sz>strng.length()){
            return "";}

        int amountOfChunks = (int) Math.floor(strng.length()/sz);
        String solution ="";


         for (int i = 0; i<amountOfChunks; i++){
             String chunk = strng.substring(0,sz);

             if (isSumDividableByTwo(chunk)){
                 solution = solution+reverseChunk(chunk);
             }

             else solution = solution+rotateChunk(chunk);
             strng =strng.replace(chunk,"");

         }
         return solution;

    }

     static String reverseChunk(String chunk){

        String str = "";
         System.out.println(chunk);

        for(int in = chunk.length()-1; in >= 0; in--)
        {
            str = str + chunk.charAt(in);
        }
         System.out.println(str);
        return str;
    }


     static String rotateChunk(String chunk){
       return chunk.substring(1)+chunk.charAt(0);

     }

     static boolean isSumDividableByTwo (String chunk){

         int sum =0;
         for (char ch: chunk.toCharArray()) {

             int number = ch-'0';
             sum = sum+ (number*number);
         }
        return sum%2==0;
     }

}