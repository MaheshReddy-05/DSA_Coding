package WeeklyContest338;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println(kItemsWithMaximumSum(3,2,0,4));
    }
    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ansSum = 0;
        while(k>0){
            k--;
            if(numOnes>0){
                ansSum++;
                numOnes--;
            }
            else if(numZeros>0){
                numZeros--;
            }
            else if(numNegOnes>0){
                ansSum--;
                numNegOnes--;
            }
            else{
                return ansSum;
            }
        }
        return ansSum;
    }
}