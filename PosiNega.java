import java.util.Scanner;

public class PosiNega {
    public static void main(String args[]){
        System.out.println("Enter a Number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if (num>=0) {
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is Negative");
        }
        sc.close();
    }
}
