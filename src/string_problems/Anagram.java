package string_problems;

import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here

public static void anagram(String[] args){
    String str1 = "Cat";
    String str2 = "Act";

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    if(str1.length() == str2.length()){
        //convert string to char.
        char[]charArray1 = str1.toCharArray();
        char[]charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        boolean result = Arrays.equals(charArray1, charArray2);

        if(result){
            System.out.println(str1 + " and " +str2 + " are anagrams. ");
        }
        else {
            System.out.println(str1 + " and " +str2 + " are NOT anagrams. ");
        }
    }
    else {
        System.out.println(str1 + " and " +str2 + " are NOT anagrams. ");
    }
}
}
