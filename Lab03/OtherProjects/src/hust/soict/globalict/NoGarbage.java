package hust.soict.globalict;

import java.util.Random;

public class NoGarbage {
    public static void main(String[] args) {
        Random r = new Random(123);
        StringBuffer sb = new StringBuffer();
        long start = System.currentTimeMillis();
        for (long i = 0; i < 10000; i++) {
            sb.append(r.nextInt(2));
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
