import java.util.Scanner;
/**
 * @brief checking prime or not
 * @param n is number which we checl
 * @param printprime  check whether n is prime
 */
public class task3 {
    public static void printprime(int n) {
        if (n==2){
            System.out.println("prime");
        } else if (n%2!=0) {
            System.out.println("prime");

        }

        else{
            System.out.println("composite");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printprime(n);
    }


}