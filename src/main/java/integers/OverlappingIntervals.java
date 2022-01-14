package integers;

public class OverlappingIntervals {
    public static int[][] merge(int[][] numArr){
        for(int i = 0; i < numArr.length; i++){
            for(int j = 0; j < 2; j++){
                if(numArr[i][1] < numArr[i][j]){
                    numArr[i][1] = numArr[i][j];
                }
            }
        }
        return numArr;
    }

    public static void main(String[] args) {
        int[][] res = OverlappingIntervals.merge(new int[][]{{1,3}, {2,6}, {8,10}, {15,8}});
        for(int[] i: res) {
            for(int j: i) System.out.print(j);
            System.out.println();
        }
    }
}
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping.

//Pseudocode
//[[1,3],[2,6],[8,10],[15,18]]
//[[1,6],[8,10],[15,18]]

//loop through external array
//loop through inner array
//push to stack
//check if peek > arr[j] else replace peek with arr[j]