import java.util.HashSet;

public class lengthOfLongestSubString {
    public static int lengthOfLongestSub(String s){
        int n=s.length();
        int left=0,right=0,maxLen=0;
        HashSet <Character> set = new HashSet<>();
        while (right<n) {
            char c = s.charAt(right);
            //set.add(s.charAt(right));
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
                
            }
            set.add(c);
            maxLen=Math.max(maxLen, right-left+1);
            right++;

            
        }
        return maxLen;
    }
        public static void main(String[] args){
            String s="jhdjkksh";
            System.out.println("longest substring length: "+ lengthOfLongestSub(s));

        }

    }

