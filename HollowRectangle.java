public class HollowRectangle {
    public static void main(String[] args){
    int totRows=4;
    int totCol=5;
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCol; j++){
                if(i==1||i==totRows||j==1||j==totCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }
}
