package arrays;

import java.util.Arrays;

public class Challenge3 {

    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        String[] intArray={"bddef","dbaqc","abcde","omadd","bbbbb"};
        System.out.println(Arrays.toString(intArray));
        radixSort(intArray,alphabet.length(),5);
    }

    public static void radixSort(String[] input, int radix, int width){
        for(int i=0;i<width;i++){
            System.out.println("Position: "+i);
            radixSingleSort(input,i,radix,width);
            System.out.println(Arrays.toString(input));
        }
    }

    private static void radixSingleSort(String[] input, int position, int radix, int width) {
        int numItems=input.length;
        int[] countArray=new int[radix];

        for (String value:input) {
            countArray[getDigit(position,value,width)]++;
        }
        System.out.println(Arrays.toString(countArray));

        for (int j = 1; j < radix; j++) {
            countArray[j]+=countArray[j-1];
        }
        System.out.println(Arrays.toString(countArray));


        String[]temp=new String[numItems];
        for (int tempIndex=numItems-1;tempIndex>=0;tempIndex--){
            temp[--countArray[getDigit(position,input[tempIndex],width)]]=
                    input[tempIndex];
        }
        for (int tempIndex=0;tempIndex<numItems;tempIndex++){
            input[tempIndex]=temp[tempIndex];
        }


    }

    private static int getDigit(int position, String value, int width) {
        System.out.println(String.format("Value: %s, Position: %s, Digit: %s",
                value,position,alphabet.indexOf(value.charAt(value.length()-1-position))));
        return alphabet.indexOf(value.charAt(value.length()-1-position));
    }

}
