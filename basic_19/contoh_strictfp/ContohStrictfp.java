package basic_19.contoh_strictfp;

import java.util.Arrays;
import java.util.List;

/* Strictfp adalah keyword untuk memastikan bahwa, anda akan mendapatkan
 * hasil yang sama pada semua platform jika melakukan operasi pada
 * variabel floating-point
 */

/* Contoh yang legal */

strictfp class A{} /* strictfp diterapkan di class */ 

strictfp interface B{} /*strictfp diterapkan di interface */

class C{  
	strictfp void m(){} /* strictfp diterapkan di method */ 
}  

/* Contoh yang ilegal */
/*
class D{  
	strictfp abstract void m(); // Kombinasi ilegal
} 
*/

/*
class E{  
strictfp int data=10;  // modifier strictfp tidak diperbolehkan
} 
*/

/*
class B{  
strictfp B(){} //modifier strictfp tidak diperbolehkan  
} 
*/



public class ContohStrictfp {
	
	strictfp void m(Double d1, Double d2){
		System.out.println("Cetak D1 : "+d1);
		System.out.println("Cetak D2 : "+d2);
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		ContohStrictfp contohStrictfp = new ContohStrictfp();
		contohStrictfp.m(5.233334, 7.4554439);
	}
}



