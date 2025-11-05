import java.util.Scanner;

public class UnequalPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        int n = s1.length();
        int i = 0;
        boolean first = true;

        while (i < n) {
            if (s1.charAt(i) != s2.charAt(i)) {
                int start = i;
                while (i < n && s1.charAt(i) != s2.charAt(i))
                    i++;
                if (!first) System.out.print(", ");
                System.out.print(s1.substring(start, i) + "-" + s2.substring(start, i));
                first = false;
            }
            i++;
        }
    }
}
