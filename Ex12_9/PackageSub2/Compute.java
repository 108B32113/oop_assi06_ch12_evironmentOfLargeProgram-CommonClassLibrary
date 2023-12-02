package Ex12_9.PackageSub2;

public class Compute extends Ex12_9.PackageSub1.MyMath { // extended class will be inputed compelet name containing packName
    public int a;
    public int b;
    public int ans;

    public void add(int a, int b){ // in implementing situation that method could remove abstract modifier
        ans = a + b;
    }
    public void sub(int a, int b){
        ans = a - b;
    }
    public void mul(int a, int b){
        ans = a * b;
    }
    public void div(int a, int b){
        ans = a / b;
    }
    
    public void show(){
        System.out.print("ans = " + ans);
    }
}
