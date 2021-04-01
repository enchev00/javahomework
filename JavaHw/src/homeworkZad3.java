import java.util.Scanner;

public class homeworkZad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vuvedi a: ");
        int a = sc.nextInt();
        System.out.println("Vuvedi b: ");
        int b = sc.nextInt();

        int razmenvach;
        razmenvach = b;
        b = a;
        a = razmenvach;

        System.out.println("A: "+a);
        System.out.println("B: "+b);


    }
}
