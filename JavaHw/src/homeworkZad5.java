import java.util.Scanner;

public class homeworkZad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vuvedi a:");
        int a = sc.nextInt();
        System.out.println("Vuvedi b:");
        int b = sc.nextInt();
        System.out.println("Vuvedi c:");
        int c = sc.nextInt();

        if (a > b && b > c) {
            System.out.println(a + " " + b + " " + c);
        }
        else if (b>a && a>c){
            System.out.println(b + " " + a + " " + c);
        }
        if(c>a && a>b){
            System.out.println(c + " " + a + " " + b);
        }
        else if (c>b && b>a){
            System.out.println(c + " " + b + " " + a);
        }




            }

        }


