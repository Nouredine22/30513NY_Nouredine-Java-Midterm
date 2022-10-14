package math_problems;

public class FindMissingNumber {

    /**
     * INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};


            // visually I see missing # is 9.

            int sum1 = 1;
            for (int i = 1; i < 10; i++) {
                sum1 = sum1 + i;
            }

            // 10+2+1+4+5+3+7+8+6 = 46.
            System.out.println("sum of array elements is " + sum1);

            int sum2 = 0;
            for (int i = 0; i<=10;i++) {
                sum2 = sum2 + i;
            }

            // 1+2+3+4+5+6+7+8+9+10 = 55
            System.out.println("sum of range array element is " + sum2);

            //55-46 = 9
            System.out.println( "Missing number is " + (sum2-sum1) );



    }
}
