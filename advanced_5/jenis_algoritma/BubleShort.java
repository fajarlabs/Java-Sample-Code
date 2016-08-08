package advanced_5.jenis_algoritma;

import java.util.Arrays;

public class BubleShort {
    public static int[] doBubleShort(int[] arr) {
        // Temporary data
    	int temp;
    	
    	// Iterasi
    	// Urutan paling belakang tidak dihitung
        for(int i=0; i < arr.length-1; i++){
        	// Dimulai dari index 1
        	// Dan urutan paling belakang tidak dihitung
            for(int j=1; j < arr.length-i; j++){
            	// Periksa index 1 - index 2, index 2 - index 3 dan seterusnya
                if(arr[j-1] > arr[j]){
                	// Simpan data lama
                    temp = arr[j-1];
                    // Tukar dengan data baru
                    arr[j-1] = arr[j];
                    // Masukkan data lama kedalam index baru
                    arr[j] = temp;
                }
            }
            
            // Cetak langkah2 iterasi
            System.out.println((i+1)+"th iteration result: "+Arrays.toString(arr));
        }
        return arr;
    }
    
    public static void lihatHasil() {
    	int arr[] = {3,5,1,-1,8,10};
    	arr = doBubleShort(arr);
    	for(int hasil : arr) {
    		System.out.print(hasil+" ");
    	}
    }
}
