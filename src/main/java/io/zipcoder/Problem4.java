package io.zipcoder;

import java.util.Arrays;

public class Problem4 {

    //Operate on the premise that a palindrome can only have 1 character type whose count amount is odd.
    //That one is used as the center pivot and the rest must be odd.
    //step1 break up the string into chars
    //step2 get count of each char
    //step3 see if there is max 1 odd count

    public Boolean canBePalindrome(String input){
        return (int)Arrays.stream(input.split("")).distinct().map(c -> input.length() - input.replaceAll(c, "").length()).filter(charCount -> (charCount % 2 != 0)).count() <= 1;
    }

}
