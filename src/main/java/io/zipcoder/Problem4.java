package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem4 {

    //Operate on the premise that a palindrome can only have 1 character type whose count amount is odd.
    //That one is used as the center pivot and the rest must be odd.
    //step1 break up the string into chars
    //step2 get count of each char
    //step3 see if there is max 1 odd count

    public Boolean canBePalindrome(String input){
        return countOdds(countChars(input)) <= 1;
    }

    ArrayList<Integer> countChars(final String input){
        return Arrays.stream(input.split("")).distinct()
                .map(c -> input.length() - input.replaceAll(c, "").length())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    Integer countOdds(ArrayList<Integer> charCounts){
        return (int)charCounts.stream().filter(charCount -> (charCount % 2 != 0)).count();
    }

}
