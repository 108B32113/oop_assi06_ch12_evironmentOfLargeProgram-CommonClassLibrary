public class Ex12_23 {
    public static void main(String args[]){
        // float num1 = 67.834; // if we want to use sigle-precision float, have to add "f" to end of value because in java, the float value be setteed a double type of default

        double num1 = 67.834;
        String str1 = Double.toString(num1);
        System.out.println(str1.length());
    }
}
