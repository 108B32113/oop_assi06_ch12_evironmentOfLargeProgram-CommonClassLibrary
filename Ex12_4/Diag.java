package Ex12_4;

public class Diag {
    private int width;
    private int height;
    public Diag(int w, int h){
        width = w;
        height = h;
    }
    public void show(){
        System.out.println("w = " + width + ", H = " + height);
        System.out.printf("length = %5.2f\n", dia()); //"%" means to prints a formatted printting
                                                             //"\n" represents(代表) a newline character(換行)
          //"printf" in C programming. It allows you to print formatted strings
    }
    public double dia(){
        return Math.sqrt(width*width + height*height);
    }
}

//format v./n. 格式化: let data to solve by specified form to display or solve
//specifier n.說明符,    specification n.規格,    specify n.指定,     specified a.指定/特定的    verify v.確認(系統上),    modify v.改變,    modifier v.修飾符/修飾語
