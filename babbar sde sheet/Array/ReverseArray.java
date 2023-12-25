// Reverse the array

import java.io.*;

public class ReverseArray {
static void reverseArray(int a[],int start,int end){
    int temp;
    if (start>=end) {
        return;

    }
    temp=a[start];
    a[start]=a[end];
    a[end]=temp;
    reverseArray(a, start+1, end-1);
}
static void printArray(int a[],int n){
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    int n=6;
    System.out.println("Original Array");
    printArray(arr, n);
    reverseArray(arr, 0, n-1);
    System.out.println("Reversed Array");
    
    printArray(arr, n);


}
    
}