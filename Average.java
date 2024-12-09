import java.util.*;
public class Average{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no.");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no.");
        int c = sc.nextInt();
        sc.close();

        int avg=a+b+c/3;
        System.out.println("Average is:"+avg);
    }
}