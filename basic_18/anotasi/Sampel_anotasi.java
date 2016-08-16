package basic_18.anotasi;

import java.awt.image.SampleModel;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

import basic_18.anotasi.TesterInfo.Priority;

public class Sampel_anotasi {
	/*
	 * Anotasi, bentuk metadata, memberikan data tentang program yang bukan
	 * merupakan bagian dari program itu sendiri. Anotasi tidak memiliki efek
	 * langsung pada operasi kode yang mereka jelasan.
	 * 
	 * Anotasi memiliki beberapa kegunaan diantaranya
	 * 
	 * - Informasi untuk compiler maksudnya anotasi dapat digunakan oleh
	 * compiler untuk mendeteksi kesalahan atau menekan peringatan.
	 * 
	 * - Waktu kompilasi dan pengolahan pada waktu-peluncuran Software tools
	 * dapat memproses informasi anotasi untuk code generator, file xml atau
	 * benteng.
	 * 
	 * - Runtime processingBeberapa anotasi tersedia untuk diperiksa pada saat
	 * runtime.
	 * 
	 * Anotasi yang sudah tersedia di java diantaranya,
	 * 
	 * @Deprecatedpenjelasan diatas menunjukkan bahwa elemen ditandai sudah
	 * ditinggalkan dan seharusnya tidak lagi digunakan
	 * 
	 * 
	 * @Overridepenjelasan menginformasikan compiler yang unsur ini dimaksudkan
	 * untukmengesampingkan unsur atau metode yang dinyatakan dalam superclass
	 * 
	 * 
	 * @SuppressWarningspenjelasan @SuppressWarnings memberitahu compileruntuk
	 * menekan peringatan tertentu yang jika variabel/metode tidak akan
	 * menghasilkan
	 * 
	 * 
	 * @SafeVarargsPenjelasan, bila diterapkan pada metode atau konstruktor,
	 * menegaskan bahwa kode tidak melakukan operasi yang berpotensitidak aman
	 * pada parameter varargs nya.
	 * 
	 * @FunctionalInterfacepenjelasan, diperkenalkan di Java SE 8, menunjukkan
	 * bahwadeklarasi tipe dimaksudkan untuk menjadi antarmuka fungsional,
	 * seperti yang didefinisikan oleh Java Language Specification.
	 * 
	 * 
	 * @Retentionpenjelasan menentukan bagaimana penjelasan ditandai disimpan:
	 * RetentionPolicy.SOURCE – penjelasan ditandai dan dipertahankan hanya di
	 * tingkat sumber dan diabaikan oleh compiler.RetentionPolicy.CLASS –
	 * penjelasan ditandai dan dipertahankan oleh compiler pada waktu kompilasi,
	 * tetapi diabaikan oleh Java Virtual Machine (JVM).RetentionPolicy.RUNTIME
	 * – penjelasan ditandai dan dipertahankan oleh JVM sehingga dapat digunakan
	 * oleh lingkungan runtime.
	 * 
	 * @Documentedpenjelasan menunjukkan bahwa setiap kali anotasi ditentukan
	 * digunakan unsur-unsurharus didokumentasikan menggunakan alat Javadoc
	 * 
	 * @Targetpenjelasan menandai penjelasan lain untuk membatasijenis elemen
	 * anotasi java dapat diterapkan untuk :
	 * 
	 * ElementType.ANNOTATION_TYPE dapat diterapkan untuk jenis anotasi.
	 * ElementType.CONSTRUCTOR dapat diterapkan untuk konstruktor.
	 * ElementType.FIELD dapat diterapkan untuk field atau properti.
	 * ElementType.LOCAL_VARIABLE dapat diterapkan untuk variabel lokal.
	 * ElementType.METHOD dapat diterapkan pada penjelasan metode-tingkat.
	 * ElementType.PACKAGE dapat diterapkan pada deklarasi paket.
	 * ElementType.PARAMETER dapat diterapkan pada parameter sebuah metode
	 * ElementType.TYPE dapat diterapkan pada semua kelas
	 * 
	 * 
	 * @Inheritedanotasi ini mengindikasikan bahwa turunan dari superclass
	 * 
	 * @Repeatableanotasi ini mengindikasikan bahwa anotasi bisa dipakai lebih
	 * dari sekaliuntuk deklarasi yang sama atau dipakai tipe
	 * 
	 * Sumber
	 * https://docs.oracle.com/javase/tutorial/java/annotations/predefined.html
	 * 
	 * Contoh sampel anotasi dibawah ini. Sumber asal
	 * https://www.mkyong.com/java/java-custom-annotations-example/
	 */
	
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		TestExample testExample = new TestExample();
		try {
			testExample.lihatHasil();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/* Membuat anotasi sepert membuat interface */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
// can use in method only.
@interface Test {

	/* should ignore this test? */
	public boolean enabled() default true;

}

/* Membuat tester info */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
/* on class level */
@interface TesterInfo {
	/* enum */
	public enum Priority { LOW, MEDIUM, HIGH }
	Priority priority() default Priority.MEDIUM;
	String[] tags() default "";
	String createdBy() default "Agus Setiawan";
	String lastModified() default "03/01/2014";
}

/* Contoh implementasi dari anotasi */
@TesterInfo(priority = Priority.HIGH, createdBy = "mkyong.com", tags = {"sales", "test" })
class TestExample {

	@Test
	void testA() {
		if (true)
			throw new RuntimeException("This test always failed");
	}

	@Test(enabled = false)
	void testB() {
		if (false)
			throw new RuntimeException("This test always passed");
	}

	@Test(enabled = true)
	void testC() {
		if (10 > 1) {
			// do nothing, this test always passed.
		}
	}

	public static void lihatHasil() throws Exception {

		System.out.println("Testing...");

		int passed = 0, failed = 0, count = 0, ignore = 0;

		/* Ambil class yang akan di test */
		Class<TestExample> obj = TestExample.class;

		/* Process @TesterInfo , apakah tester info tersedia ? */
		if (obj.isAnnotationPresent(TesterInfo.class)) {

			/* Dapatkan anotasi dari kelasnya */
			Annotation annotation = obj.getAnnotation(TesterInfo.class);
			
			/* Casting ke tester info */
			TesterInfo testerInfo = (TesterInfo) annotation;

			System.out.printf("%nPriority :%s", testerInfo.priority());
			System.out.printf("%nCreatedBy :%s", testerInfo.createdBy());
			System.out.printf("%nTags :");

			int tagLength = testerInfo.tags().length;
			for (String tag : testerInfo.tags()) {
				if (tagLength > 1)
					System.out.print(tag + ", ");
				else
					System.out.print(tag);
				
				tagLength--;
			}

			System.out.printf("%nLastModified :%s%n%n",testerInfo.lastModified());

		}

		/* Process @Test 
		 * Dapatkan metode2 dari kelasnya
		 */
		for (Method method : obj.getDeclaredMethods()) {

			/* jika metode annotasi @Test tersedia ?*/
			if (method.isAnnotationPresent(Test.class)) {

				/* Dapatkan anotasi */
				Annotation annotation = method.getAnnotation(Test.class);
				
				/* Casting ke @Test */
				Test test = (Test) annotation;

				/* jika enabled = true (default) */
				if (test.enabled()) {

					try {
						method.invoke(obj.newInstance());
						System.out.printf("%s - Test '%s' - passed %n",++count, method.getName());
						passed++;
					} catch (Throwable ex) {
						System.out.printf("%s - Test '%s' - failed: %s %n",
								++count, method.getName(), ex.getCause());
						failed++;
					}

				} else {
					System.out.printf("%s - Test '%s' - ignored%n", ++count,
							method.getName());
					ignore++;
				}

			}

		}
		System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n",
				count, passed, failed, ignore);

	}
}
