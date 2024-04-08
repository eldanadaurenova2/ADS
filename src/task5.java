import java.util.Scanner;
/**
 * @brief finding factorial
 * @param n number
 * @param  fib return n_th number in Fibanacci sequence
 */
public class task5{
    public static int fib(int n) {
        if (n==1) {
            return 1 ;
        } else if (n==0) {
            return 0;

        }

        int f=fib(n-1)+fib(n-2);

        return f;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibnumber=fib(n);
        System.out.println(fibnumber);
    }


}