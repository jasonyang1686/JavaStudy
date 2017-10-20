package algorithms;
public class InsertationSort{
static int[] insertionSort(int[] arr) {

      for (int i = 1; i < arr.length; i++) {
            int newValue = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                  arr[j] = arr[j - 1];
                  j--;
            }
            arr[j] = newValue;
      }
      return arr;
}
public static void main(String[]args){
	int[]arr={5,4,3,2,1};
	insertionSort(arr);
	System.out.println(arr[2]);
}
}