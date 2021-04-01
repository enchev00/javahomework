import java.util.Scanner;

public class homeworkZad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vuvedi a:");
        int a = sc.nextInt();
        System.out.println("Vuvedi b:");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }
    }
}
