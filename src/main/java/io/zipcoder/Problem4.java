package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Problem4 {

    //Operate on the premise that a palindrome can only have 1 character type whose count amount is odd.
    //That one is used as the center pivot and the rest must be odd.

    public Boolean canBePalindrome(String input){
        //step1 break up the string into chars
        //step2 get count of each char
        //step3 see if there is max 1 odd count

        Boolean canBePalindrome = null;
        HashMap<Character, Integer> charCounts = countChars(input);
        int oddCount = countOdds(charCounts);
        if(oddCount <= 1){
            canBePalindrome = true;
        } else {
            canBePalindrome = false;
        }
        return canBePalindrome;
    }

    HashMap<Character, Integer> countChars(String input){
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

        while(input.length() != 0){
            Character activeChar = input.charAt(0);
            int countActive = input.length() - input.replaceAll((activeChar+""), "").length();
            charCount.put(activeChar, countActive);
            input = input.replaceAll((activeChar+""), "");
        }

        return charCount;
    }

    Integer countOdds(HashMap<Character, Integer> charCounts){
        ArrayList<Integer> counts = new ArrayList<Integer>(charCounts.values());
        int oddCount = 0;
        for (Integer charCount : counts) {
            if(charCount % 2 == 1){
                oddCount++;
            }
        }
        return oddCount;
    }

}
