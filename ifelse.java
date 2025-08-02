import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ennter age = ");
        int age = sc.nextInt();
        if (age<18) {
            System.out.println("not adult");
        }else
            System.out.println("adult");

    }
    
}
