import java.util.concurrent.ThreadLocalRandom;

public class GerenrateRandomNumber {
        public static void main(String[] args)

        {
            //Generate random number using this function.
            long rand= System.currentTimeMillis();
            System.out.println(rand);
            System.out.println(Math.random());
            System.out.println(ThreadLocalRandom.current().nextInt());

        }

    }


