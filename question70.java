public class question70 {
    public static void main(String[] args) {
        int n =5;
        climbStairs(n);
    }


    public static int climbStairs(int n) {
        if (n<=3) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 2;
            } else if (n == 3) {
                return 3;
            }
        }

        int temp=0,temp1=2,temp2=3;


        while (n>3){
            temp=temp1+temp2;

            temp1=temp2;
            temp2=temp;

            n--;
        }


        return temp;
    }


}
