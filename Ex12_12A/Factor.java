package Ex12_12A;

public class Factor {
    public int fac(int n){
        // Calculate for factorial(階乘)
        if(n >= 1)
            return n * fac(n-1); // in java, if conditional statement have only one instuction that the statement can not use curly brackets
            // ex: 3! = 1*2*3 = 3*(3-1)
            // used fac which means we again call fac Method and not only use its value(n-1)
        else
            return 1; // if 1! then return only value 1
    }
}
