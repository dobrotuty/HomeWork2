public class Ball {
    private double x = 0;
    private double y = 0;
    public Ball(double xx,double yy){
        x = xx;
        y = yy;
    }
    public  Ball(){
        x = 0;
        y = 0;
    }
    public void SetX(double x){
        this.x = x;
    }
    public double GetX(){
        System.out.println(x);
        return x;
    }
    public void SetY(double y){
        this.y = y;
    }
    public double GetY(){
        System.out.println(y);
        return y;
    }
    public void SetXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString(){
        return "Ball X = " +GetX()+", Y = "+GetY();
    }
}
