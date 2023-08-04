import java.util.Scanner;
//Q1 : Remove Duplicates in-place from Sorted Array
public class S4 {
    static int tofind(int arr[],int n){
        int i = 0;
        for (int j=1;j<=n-1;j++){
            if (arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return (i+1);
    }
    static void toprint(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int arr[] = new int[n];
        //input
        for (int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("RESULTANT ARRAY :");
        //output
        toprint(arr);
        //tofind
        System.out.println();
        int k =tofind(arr,n);
        System.out.println("UNIQUE ELEMENTS ARE : "+k);
    }
}
