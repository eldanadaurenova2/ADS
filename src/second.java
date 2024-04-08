import java.util.Scanner;

/**
 * @brief finding  the average number of the array
 * @param n size of array
 * @param arr array
 * @param printave finds the average
 */

public class second {
    public static void printave(int arr[],int n) {
        float c=0;
        for(int i=0;i<n;i++){
            c=c+arr[i];
        }
        float average=c/n;
        System.out.println(average);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printave(arr,n);
    }


}