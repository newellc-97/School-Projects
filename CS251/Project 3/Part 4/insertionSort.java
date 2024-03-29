public class insertionSort {
    public int insertionSort(int[] array) { //Sort in place and return number of swaps
        int count = 0;
        int temp;

        //Sort array
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    count++;
                }
            }
        }

        return count;
    }
}
