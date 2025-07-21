public class OddEvenBinary {
    
    public static void evenOdd(int n){
        int bit=1;
        if((n & bit)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask=1<<i;
        if ((n & bitMask) == 0) {
            return 0;
        }
        else{
            return 1;
        }

    }

    public static void main(String[] args) {
        evenOdd(3);
        evenOdd(14);
        evenOdd(15);
        getIthBit(15, 2);
    }
}
