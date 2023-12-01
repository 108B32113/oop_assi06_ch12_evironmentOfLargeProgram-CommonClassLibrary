package Ex12_3;

// Ex12_3, 檔案分割的練習
public class MyWindow{ // if I used splitted file that the class can add pullic modifier on front position
    private int width;
    private int height;
    private String name;

    public MyWindow(int w, int h, String s){
        width = w;
        height = h;
        name = s;
    }
    
    public void show(){
        System.out.println("Name=" + name);
        System.out.println("W=" + width + ", H=" + height);
    }
}