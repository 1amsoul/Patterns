import java.util.*;

public class ConcentricSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int min = Math.min(Math.min(i - 1, size - i), Math.min(j - 1, size - j));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}