public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(30,40);
        Ball b2 = new Ball();
        b2.SetX(333);
        b2.GetX();
        b2.move(100,213);
        b1.SetXY(456,321);
        System.out.println(b1);
        System.out.println(b2);
    }
}
