import java.lang.*;
public class TestBook {
    public static void main(String[] args) {

        Book b1 = new Book(" Bulgakov", 350);
        Book b2 = new Book(" Stark", 245);
        Book b3 = new Book(" Zvezdnaya", 400);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.intoSalePrice();
        b2.intoSalePrice();
        b3.intoSalePrice();

    }
}
