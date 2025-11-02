//package dailycoding;
import java.util.*;

public class AlternatePosNeg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        rearrangeArray(arr, n);

        System.out.println("Rearranged array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static void rearrangeArray(int arr[], int n){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // separating positives and negatives
        for(int i=0; i<n; i++){
            if(arr[i] >= 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }

        int i = 0, p = 0, ng = 0;

        // placing alternatively
        while(p < pos.size() && ng < neg.size()){
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(ng++);
        }

        // if any remaining positives
        while(p < pos.size()){
            arr[i++] = pos.get(p++);
        }

        // if any remaining negatives
        while(ng < neg.size()){
            arr[i++] = neg.get(ng++);
        }
    }
}