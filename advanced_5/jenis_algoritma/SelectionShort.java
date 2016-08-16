package advanced_5.jenis_algoritma;

import java.util.Arrays;

public class SelectionShort {
	
    public static int[] doSelectionSort(int[] arr){
        
    	/* Posisi paling belakang tidak dihitung */
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
            	/* Periksa index value paling kecil */
                if (arr[j] < arr[index])
                    index = j;
            }
            
            /* Tukar posisi array index dan value */
            int smallerNumber = arr[index];  // Ambil value dari index asli dan tampung
            arr[index] = arr[i];             // Isi index dengan array baru
            arr[i] = smallerNumber;          // Isikan index dengan data lama
            
            /* Cetak langkah2 iterasi */
            System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
        }
        return arr;
    }
    
    public void lihatHasil() {
    	int arr[] = {3,5,1,-1,8,10};
    	arr = doSelectionSort(arr);
    	for(int hasil : arr)
    		System.out.print(hasil+" ");
    
    }
    
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */    
    public static void main(String[] args) {
    	SelectionShort selectionShort = new SelectionShort();
    	selectionShort.lihatHasil();
    }
}
