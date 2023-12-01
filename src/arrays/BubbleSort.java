package arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};

        for (int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i=0;i<lastUnsortedIndex;i++){
                if(intArray[i]>intArray[i+1])
                    ArrayUtils.swap(intArray,i,i+1);
            }
            System.out.println(Arrays.toString(intArray));
        }

        //System.out.println(Arrays.toString(intArray));
    }
}
