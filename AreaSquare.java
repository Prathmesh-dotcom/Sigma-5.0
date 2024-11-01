import java.util.*;
public class AreaSquare {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of side:");
        int side= sc.nextInt();
        sc.close();

        int area= side*side;
        System.out.println("Area of square:"+area);
    }
    
}
