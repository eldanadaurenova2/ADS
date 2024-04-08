import java.util.Scanner;

/**
 * checking whether “s” is all consists of digits
 * @param s string
 * @param n length of string
 * @return returns answer
 */

public class  task8 {
    public static boolean checkString(String s,int n){
        if(n==0){
            return Character.isDigit(s.charAt(0));
        }
        else{
            return Character.isDigit(s.charAt(n))&&checkString(s,n-1);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length()-1;
        boolean answer = checkString(s,n);
        if(answer){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}