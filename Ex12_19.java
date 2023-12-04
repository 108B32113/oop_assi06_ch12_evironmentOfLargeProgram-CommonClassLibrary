public class Ex12_19 {
    public static void main(String args[]){
        System.out.println();
        double sum = cal(domain);
        System.out.println(sum);
    }


    public static int domain = 5;

    public static double cal(int domain){
        double sum = 0;
        for(int i=1; i<=domain; i++){
            sum += Math.sqrt(i); // transform to sqaureRoot value
        }
        return sum;
    }
}
