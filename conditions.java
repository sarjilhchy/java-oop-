import java.util.Scanner;

public class conditions {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter, A = ");
        int a = sc.nextInt();

        System.out.print("Enter, B = ");
        int b = sc.nextInt();

        if (a==b) {
            System.out.println("A and B Equal.");
        }else if (a<b) {
            System.out.println("B is greater.");
        }else{
            System.out.println("A is greater.");
            
        }

    }
    
}
