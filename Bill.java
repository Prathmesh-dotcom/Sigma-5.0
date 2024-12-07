import java.util.*;
public class Bill {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter price of pencil");
        float pencil= sc.nextFloat();
        System.out.println("Enter price of pen");
        float pen= sc.nextFloat();
        System.out.println("Enter price of eraser");
        float eraser= sc.nextFloat();
        sc.close();

        float bill=pencil+pen+eraser;
        System.out.println("pencil: "+pencil+" rs.");
        System.out.println("pen: "+pen+" rs.");
        System.out.println("eraser: "+eraser+" rs.");
        System.out.println("Total: "+bill+" rs.");
        
        


    }
    
}
