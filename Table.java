import java.util.Scanner;

public class Table {
    public static void MultiplicationTable(int num) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        sc.close();
    }
    public static void main(String s[]){
        MultiplicationTable(5);
        
    }

}
