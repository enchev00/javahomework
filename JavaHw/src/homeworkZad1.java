import java.util.Scanner;

public class homeworkZad1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vyvedi A: ");
        double a = sc.nextDouble();
        System.out.println("Vyvedi B: ");
        double b = sc.nextDouble();
        System.out.println("Vyvedi C: " );
        double c = sc.nextDouble();

        if(a>c || b<c && a<c || b>c){
            System.out.println("C e mejdu A i B");
        }
        else {
            System.out.println("C ne e mejdu A i B");
        }

    }
}
