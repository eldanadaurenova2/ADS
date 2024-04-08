import java.util.Scanner;

public class task6{
    /**
     * @brief finding power of the number
     * @param n number
     * @param  power return power of the number
     */

    public static int power(int a ,int n) {
        if (n==1) {
            return a ;
        } else if (n==0) {
            return 1;

        }

        int f=a*power(a,n-1);

        return f;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int powerofnum=power(a,n);
        System.out.println(powerofnum);
    }


}