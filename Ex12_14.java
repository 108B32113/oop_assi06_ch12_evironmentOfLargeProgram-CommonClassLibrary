public class Ex12_14 {
    public static void main(String args[]){
        String str1 = "Habit is second nature.";

        //String strSub1 = str1.substring(0, 7); // extract part of original String
                                                                   // Not contain 7th digit
                                                                   // space else is a digit(8 bits) => in ASCII(ask-ee)(a coding system)
                                                                     // alphabet else is 8 bits
        
        String strSub2 = str1.substring(16, 22); // starting begin 7 digit and it print at all
        
        System.out.println(strSub2);
        
        //System.out.println(strSub1);
    }
}




// American Standard Code for Information Interchange(交換的.../交會處) 美國標準資訊交換碼