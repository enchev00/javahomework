import java.util.Scanner;

public class homeworkZad2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vuvedi 1-voto chislo");
        int a = sc.nextInt();
        System.out.println("Vuvedi 2-roto chislo");
        int b = sc.nextInt();
        System.out.println("Vuvedi 3-toto (Double) chislo");
        double aD = sc.nextDouble();
        System.out.println("Vuvedi 4-toto (Double) chislo");
        double bD = sc.nextDouble();

        int suma = a + b;
        int razlika = a - b;
        int proizvedenie = a * b;
        int ostatuk = a % b;
        int delenie = a / b;

        System.out.println("suma = " + suma);
        System.out.println("razlika = " + razlika);
        System.out.println("proizvedenie = " + proizvedenie);
        System.out.println("Ostatuk = " +ostatuk);
        System.out.println("Delenie = " +delenie);

        System.out.println("-------------------------------");
        double sumaD = aD + bD;
        double razlikaD = aD - bD;
        double proizvedenieD = aD * bD;
        double ostatukD = aD % bD;
        double delenieD = aD / bD;

        System.out.println("suma = " + sumaD);
        System.out.println("razlika = " + razlikaD);
        System.out.println("proizvedenie = " + proizvedenieD);
        System.out.println("Ostatuk = " +ostatukD);
        System.out.println("Delenie = " +delenieD);
    }

}
