
import java.util.Scanner;
/**
 * @brief finding GCD
 * @param a number
 * @param b number
 * @GCD return GCD
 */
public class task10{
    public static int GCD(int a,int b){
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = GCD(a,b);
        System.out.println(result);
    }
}
