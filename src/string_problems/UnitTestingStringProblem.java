package string_problems;

import java.util.Arrays;

public class UnitTestingStringProblem {

    /**
     Use this class to unit test all of the classes contained within this package
     */

    public static void main(String[] args) {




        String str1 = "cat";
        String str2 = "act";



        if(str1.length() == str2.length()){
            //convert string to char.
            char[]charArray1 = str1.toCharArray();
            char[]charArray2 = str2.toCharArray();
            //sorting the char array
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






