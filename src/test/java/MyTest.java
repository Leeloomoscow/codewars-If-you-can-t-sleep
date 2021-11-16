import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testSomething() {
        assertEquals("1 sheep...", Kata.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));
    }

    private static class Kata {
        public static String countingSheep(int num) {
            String text = " sheep...";
            StringBuilder result = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                result.append(i).append(text);
            }
            return result.toString();
        }
    }
}
