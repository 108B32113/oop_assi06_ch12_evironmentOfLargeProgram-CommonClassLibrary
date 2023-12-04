public class Ex12_22 {
    public static void main(String args[]){
        
    }

    public static double cal(){
        double angle1 = Math.PI / 6;
        double sin = Math.sin(angle1);

        double angle2 = Math.PI / 3;
        double cos = Math.cos(angle2);

        double ans = sin + cos;
        return ans;
    }
}




/*
hypotenuse 斜邊
opposite(altitude) 對邊
adjacent(base) 鄰邊

sin(θ): O/H, 斜邊分之對邊, θ(theta)是角度的意思 可指任意角度 用於數學 物理學中
  sine 正弦
cos(θ): A/H, 斜邊分之鄰邊
  cosine 餘弦
tan(θ): O/A, 鄰邊分之對邊
  tangent 正切

表示角度兩個方法:
  degree度  radians弧度(完整圓有2π弧)
*/