public class BionomialCoeff {
    public static int factorial(int num){
        int f=1;
        for(int i=1; i<=num; i++ ){
            f=f*i;
        }
        return f;
    }

    public static int binocCoeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int binocCoeff=fact_n/(fact_r*fact_nmr);
        return binocCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binocCoeff(5, 2));
    }
}
