package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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

    @Test
    public void countCharsTest(){
        Problem4 problem4 = new Problem4();
        String input = "aabbcccdddf";
        HashMap<Character, Integer> countedChars = problem4.countChars(input);
        ArrayList<Character> keys = new ArrayList<Character>(countedChars.keySet());

        Assert.assertEquals(2, (int)countedChars.get('a'));
        Assert.assertEquals(2, (int)countedChars.get('b'));
        Assert.assertEquals(3, (int)countedChars.get('c'));
        Assert.assertEquals(3, (int)countedChars.get('d'));
        Assert.assertEquals(1, (int)countedChars.get('f'));

    }

    @Test
    public void countOddsTest(){
        Problem4 problem4 = new Problem4();
        String input = "aabbcccdddf";
        HashMap<Character, Integer> countedChars = problem4.countChars(input);
        ArrayList<Character> keys = new ArrayList<Character>(countedChars.keySet());

        int actual = problem4.countOdds(countedChars);
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

}
