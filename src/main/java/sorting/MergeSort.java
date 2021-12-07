package sorting;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int[] numbers = {5,6,3,8};

        int[] results = MergeSort.mergeSort(numbers);
        for(int i: results) System.out.println(i);

    }

    public static int[] mergeSort(int[] inputArray){
        int inputLength = inputArray.length;
        if(inputLength < 2) return null;

//        Find midpoint of array
        int midIndex = inputLength/2;
//        Split array into two
//        Create left and right array to accommodate values from the inputArray
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
//        Populate the left half
        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }
//        Populate right half
        for(int i = midIndex; i < rightHalf.length; i++){
            rightHalf[i - midIndex] = inputArray[i];
        }
//        To get two completely sorted halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
        return inputArray;
    }

    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
//        We need three pointers to walk through each array: inputArray, leftHalf and rightHalf
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
//        while (i < leftSize){
//            inputArray[k] = leftHalf[i];
//            i++;
//            k++;
//        }
//
//        while (j < rightSize){
//            inputArray[k] = leftHalf[j];
//            j++;
//            k++;
//        }
    }

}
