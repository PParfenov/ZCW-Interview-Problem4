package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Problem4Test {

    @Test
    public void canBePalindromeTrueTest(){
        Problem4 problem4 = new Problem4();
        String input = "aabbccddf";

        Boolean actual = problem4.canBePalindrome(input);

        Assert.assertTrue(actual);
    }

    @Test
    public void canBePalindromeFalseTest(){
        Problem4 problem4 = new Problem4();
        String input = "aabbcccdddf";

        Boolean actual = problem4.canBePalindrome(input);

        Assert.assertFalse(actual);
    }

}
