package integers;

public class MergeSorted {
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] mergedArray = new int[m + n];

        int j = 0;
        int k = 0;
        int pick;

        for(int i = 0; i < (m + n); i++){
            if(j < m && k < n){
                if(arr1[j] < arr2[k]){
                    pick = arr1[j];
                    j++;
                }else{
                    pick = arr2[k];
                    k++;
                }
            }else if(j < m) {
                pick = arr1[j];
                j++;
            }else{
                pick = arr2[k];
                k++;
            }

            mergedArray[i] = pick;

        }




        return mergedArray;
    }
    public static void main(String[] args) {
        int[] result = MergeSorted.mergeArrays(new int[]{1,2,5}, new int[] {2,3});
        for(int i: result) System.out.println(i);
    }
}
