package arrays;

import java.util.Arrays;

public class Challenge2 {

    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};

        insertionSort(intArray, intArray.length);
    }

    public static void insertionSort(int[] intArray,int n){
        if(n<=1)
            return;
        insertionSort(intArray,n-1);
        int firstUnsortedIndex=n-1;
        int newElement=intArray[firstUnsortedIndex];
        int i;
        for(i=firstUnsortedIndex;i>0&&intArray[i-1]>newElement;i--){
            intArray[i]=intArray[i-1];
        }
        intArray[i]=newElement;

        System.out.println(Arrays.toString(intArray));
    }
}
