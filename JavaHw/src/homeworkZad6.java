import java.util.Scanner;

public class homeworkZad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vuvedi a1: ");
        int a1 = sc.nextInt();
        System.out.println("Vuvedi a2: ");
        int a2 = sc.nextInt();
        System.out.println("Vuvedi a3: ");
        int a3 = sc.nextInt();

        int aSuhranitel;

        aSuhranitel = a1;
        a1 = a2;
        a2 = a3;
        a3 = aSuhranitel;

        System.out.println("a1=" +a1);
        System.out.println("a2=" +a2);
        System.out.println("a3=" +a3);


    }
}
