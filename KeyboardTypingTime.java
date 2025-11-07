
import java.util.*;

public class KeyboardTypingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keyboard = sc.next(); // 10 digits
        String number = sc.next();   // number to type

        int[] pos = new int[10];
        for (int i = 0; i < 10; i++) {
            pos[keyboard.charAt(i) - '0'] = i;
        }

       
        int time = 0;
        int currentIndex = 0;

        for (char ch : number.toCharArray()) {
            int targetIndex = pos[ch - '0'];
            time += Math.abs(currentIndex - targetIndex);
            currentIndex = targetIndex;
        }

        System.out.println(time);
        sc.close();
    }
}
