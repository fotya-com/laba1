import java.lang.*;
public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball ("Yellow", 5);
        Ball b2 = new Ball("White", 6);
        Ball b3 = new Ball("Black", 7);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.intoRadius();
        b2.intoRadius();
        b3.intoRadius();

    }
}