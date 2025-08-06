import java.util.Random;

public class ByeWorld {
    public static void main(String[] args) {
        System.out.println("Bye, World!");

        Random generator = new Random();
        System.out.println(generator.nextInt(0,256));
    }
}