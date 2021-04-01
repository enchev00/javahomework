import java.util.Scanner;

public class homeworkZad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Vuvedi chas: ");
        int time = sc.nextInt();
        System.out.println("Vuvedi pari: ");
        double money = sc.nextDouble();
        System.out.println("Zdrav li sum?: ");
        boolean health = sc.nextBoolean();

        if(health == false){
            System.out.println("Bolen sum,nqma da izlizam!");
            if(money > 0){
                System.out.print("Shte si kupq lekarstva ,imam pari");
            }
            else {
                System.out.println("Nqmam pari, shte se lekuvam sam s chai ot babini zabi..");
            }
        }
        if(health == true){
            System.out.println("Zdrav sum!");
            if(money < 10){
                System.out.println("Otivam na kafence!");
            }
        }


    }

}
