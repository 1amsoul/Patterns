import java.util.*;

public class ReverseAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print((char)('A' + n - j + i - 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}