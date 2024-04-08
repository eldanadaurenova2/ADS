import java.util.Scanner;

public class task7{
    /**
     *  returns given array in reverse order without using array data structure.
     * @param arr array
     * @param f first element
     * @param l last element
     */
    public static void reverse(int[] arr, int f, int l) {
        if (f >= l) {
            return;
        }

        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;

        reverse(arr, f + 1, l - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int f=0;
        int l=arr.length-1;
        reverse(arr, f,l);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}