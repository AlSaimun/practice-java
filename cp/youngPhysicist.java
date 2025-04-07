import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x, y, z, sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < n; i ++){
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();
            sum1 += x;
            sum2 += y;
            sum3 += z;
        }
        if (sum1 == 0 && sum2 == 0 && sum3 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
