import java.util.Scanner;

public class evenoddchk {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");

        int num = sc.nextInt();
        
        if (num%2==0) {
            System.out.println("even number");
        }else
            System.out.println("odd number");
    }
}
