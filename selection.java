import java.util.*;
public class selection {

    static int select(int arr[], int i)
    {
    // code here such that selecionSort() sorts arr[]
    int min = i;
    
    for(int j=i+1; j < arr.length; j++) {
        if(arr[j] < arr[min]) {
          min = j;
        }
    }
    return min;
    }

    static void selectionSort(int arr[], int n)
    {
      //code here
      int temp = 0;
      for(int i=0; i<n-1; i++) {
      int min = select(arr,i);
        
      temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,67,54,32,89};
        int n = arr.length;
        selectionSort(arr,n);

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}