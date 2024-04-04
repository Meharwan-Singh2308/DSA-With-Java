public class TillingPrblm {

    public static int tillingProblem(int n)
    {
        //base case
        if(n == 1 | n == 0){
            return 1;
        }

        int fnm1 = tillingProblem(n - 1);

        int fnm2 = tillingProblem(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(tillingProblem(7));               
    }
}