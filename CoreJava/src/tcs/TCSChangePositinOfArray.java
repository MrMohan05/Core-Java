package tcs;
import java.util.*;
public class TCSChangePositinOfArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate:");
        int d = sc.nextInt();
        d = d % n; 
        rotateArray(arr, d);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
        sc.close();
    }
    public static void rotateArray(int[] arr, int d) 
    {
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    public static void reverse(int[] arr, int start, int end) 
    {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
