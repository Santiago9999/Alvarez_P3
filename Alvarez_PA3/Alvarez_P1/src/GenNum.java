import java.security.SecureRandom;

public class GenNum {
    static SecureRandom random = new SecureRandom();

    public static int RandomInt(int y) {
        int x = random.nextInt(y);
        return x + 1;
    }
}




