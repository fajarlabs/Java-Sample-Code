package advanced_5.jenis_algoritma;

public class InsertionSort {
	 
    public void lihatHasil(){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
     
    public int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
  
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
    public static void main(String[] args) {
    	InsertionSort insertionSort = new InsertionSort();
    	insertionSort.lihatHasil();
    }
}
