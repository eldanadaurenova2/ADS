import java.util.Scanner;
/**
 * @brief finding factorial
 * @param n number gor factorial
 * @param  factorial return foctorial of the number
 */
public class task4{
    public static int factorial(int n) {
        if (n==1) {
            return 1 ;
        }

        int f=factorial(n-1)*n;

        return f;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorialofn=factorial(n);
        System.out.println(factorialofn);
    }


}