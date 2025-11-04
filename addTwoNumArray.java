import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addTwoNumArray {
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        int[] arr1={1,2,3,3};
        int[] arr2={3,6,4,3};
        //int carry=0;
        List<Integer> result=addtwonum(arr1,arr2);
        //return result;
        System.out.println("result"+result);
    }
    public static List<Integer> addtwonum(int[] num1, int[] num2){
        List<Integer> result=new ArrayList<>();
        int i=0,j=0,carry=0;

        while(i<num1.length || j<num2.length || carry!=0){
            int x=(i<num1.length?num1[i]:0);
            int y=(j<num2.length?num2[j]:0);

            int sum=x+y+carry;
            carry=sum/10;
            result.add(sum%10);

            i++;
            j++;


        }
        return result;
    }
    
}
