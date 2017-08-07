package coderbyte.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by fouli on 8/6/2017.
 */
@RunWith(Parameterized.class)
public class PalindromeTest {
    private String word;
    private boolean bool;

    public PalindromeTest(String word, boolean bool) {
        this.word = word;
        this.bool = bool;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{"racecar", true}});
    }

    @Test
    public void test() {
        Palindrome palindrome = new Palindrome();
        assertEquals(bool, palindrome.isPalindrome(word));

    }

}