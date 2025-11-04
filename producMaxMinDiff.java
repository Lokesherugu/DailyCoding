import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class producMaxMinDiff {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        if(map.size()<=1){
            System.out.println(0);
            return;
        }
        int max=Collections.max(map.keySet());
        int min=Collections.min(map.keySet());
        if(max==min){
            System.out.println(0);
        }
        else{
            System.out.println(max-min);
        }
        
    }
    
}
