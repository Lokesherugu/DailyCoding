// Day 1 - Count of prime numbers in an array
//package Dailycoding;
import java.util.*;

public class CountPrimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(isPrime(arr[i])){
                count++;
            }
        }

        System.out.println("Count of prime numbers: " + count);
        sc.close();
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
