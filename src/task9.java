import java.util.Scanner;
/**
 * finds Cnk(binomial coefficient)
 * @param k number
 * @param n number
 * @return answer
 */
public class task9 {
    public static int binomial(int k,int n){
        if (k==0||k==n){
            return 1;
        }
        if (n==0||n==1){
            return 1;
        }
        else{
            return binomial(k-1,n-1)+binomial(k,n-1);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int result = binomial(k,n);
        System.out.println(result);
    }
}