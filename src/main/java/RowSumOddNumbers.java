class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {

        int solution = 0;
        int temp = 0;

        for (int lvl = 1; lvl<=n;lvl++) {

                for (int i = 1; i<=lvl;i++){
                temp++;
                    while ((temp %2)==0){
                        temp++;
                    }
                if (lvl == n) {
                    solution += temp;
                }
            }
        }
        return solution;
    }
}