package basic_3.array_dasar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayDasar {
	// Array 1 dimensi
	private String warna[] = {"merah","kuning","hijau"}; 
	private int hitung[] = {1,2,3,4,5,6,7,8,9,10};
	private char gender[] = {'L','P'};
	private double gaji[] = {2.0,2.5,4.2};
	
	private String warna_2[][] = {{"merah"},{"kuning","hijau"}}; 
	private int hitung_2[][] = {{1,2,3},{4,5,6},{7,8,9,10}};
	private char gender_2[][] = {{'L','P'}};
	private double gaji_2[][] = {{2.0,2.5,4.2}};
	
	private String warna_3[][][] = {{{"merah"}},{{"kuning"}},{{"hijau"}}};
	// dan seterusnnya
	
	// Dengan dengan ukuran array
	private String baju[] = new String[2];
	private char ukuran[] = new char[2];
		
	
	// Array Object value
	private List<String> arrList = new ArrayList<>();
	
	// Array Object key & value
	private Map<String,String> arrObject = new HashMap<>();
	
	// Cetak array 1 dimensi
	public void cetakWarna() {
		for(String hasil : warna) {
			System.out.println(hasil);
		}
	}
	
	// Cetak array 2 dimensi
	public void cetakWarna2() {
		for(String[] o : warna_2) {
			for(String hasil : o) {
				System.out.println(hasil);
			}
		}
	}
	
	// Cetak array 3 dimensi
	public void cetakWarna3() {
		for(String[][] o : warna_3) {
			for(String[] o2 : o) {
				for(String hasil : o2) {
					System.out.println(hasil);
				}
			}
		}
	}
	
	// Cetak array list
	public void cetakArrayList() {
		arrList.add("Hello");
		arrList.add("World");
		for(String list : arrList) {
			System.out.println(list);
		}
	}
	
	// Cetak hashmap
	public void cetakHashMap() {
		arrObject.put("data1", "Hello");
		arrObject.put("data2", "World");
		// gunakan iterator
		Iterator<?> iter = arrObject.entrySet().iterator();
		while(iter.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, String> pair = (Map.Entry<String, String>) iter.next();
			System.out.println("Key : "+pair.getKey()+" Value : "+pair.getValue());
			iter.remove();
		}
	}
}
