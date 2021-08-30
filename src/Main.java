import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        for(int i = result; i < 100; i++) {
            System.out.println("Hello..."); //prints character
            System.out.println(i);
        }
    }
}
