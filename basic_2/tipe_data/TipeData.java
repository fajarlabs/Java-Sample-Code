package basic_2.tipe_data;

// Didalam java terdapat 2 jenis tipedata diantaranya 

// 1. Primitive Data Types atau tipe data primitif
// 2. Reference/Object Data Types atau tipe data yang dikembangkan 

public class TipeData {
	
	/* Tipe data primitif */
	
	// Tipe 8-bit signed
	// Range-nya -128 (-2^7) s/d 127 (inclusive) (2^7 -1)
	private byte tipe_byte = 127;
	
	// Tipe 16-bit signed
	// Range-nya -32,768 (-2^15) s/d 32,767 (inclusive) (2^15 -1)
	private short tipe_short = 32767;
	
	// Tipe 32-bit signed 
	// Range-nya -2,147,483,648.(-2^31) s/d 2,147,483,647(inclusive).(2^31 -1)
	private int tipe_int = 2147483647;
	
	// Tipe 64-bit signed 
	// Range-nya -9,223,372,036,854,775,808.(-2^63) s/d 9,223,372,036,854,775,807 (inclusive). (2^63 -1)
	private long tipe_long = 9223372036854775807L;
	
	// Tipe single-precision 32-bit IEEE 754 floating point
	// Nilai default-nya 0.0f
	// Range 1.4E-45 s/d 3.4028235E38f;
	private float tipe_float = 3.4028235E38f;
	
	// Tipe double-precision 64-bit IEEE 754 floating point
	// Range 4.9E-324 s/d 1.7976931348623157E308
	private double tipe_double = 1.7976931348623157E308;
	
	// Tipe informasi representasi bit
	// Range 0 - 1 atau true - false
	private Boolean tipe_boolean = true;
	
	// Tipe single 16-bit Unicode character. 
	// Range minimum value is '\u0000' (or 0) dan maximum value is '\uffff' (or 65,535 inclusive)
	// char adalah tipe data yang dipakai untuk menyimpan tipe data apapun.
	// contoh char abjad = 'A';
	// gunakan single-quote atau petik tunggal
	private char tipe_char = 'A';
	
	/* Tipe data Wrapper */
	
	// Integer
	// Didalam kelas Integer ada berbagai methode-methode
	// Selengkapnya http://docs.oracle.com/javase/7/docs/api/java/lang/Byte.html
	private Byte tipe_byte_kelas;
	
	// Selengkapnya http://docs.oracle.com/javase/7/docs/api/java/lang/Short.html
	private Short tipe_short_kelas;
	
	// Selengkapnya http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
	private Integer tipe_integer_kelas;
	
	// Selengkapnya http://docs.oracle.com/javase/7/docs/api/java/lang/Long.html
	private Long tipe_long_kelas;
	
	// Selengkapnya http://docs.oracle.com/javase/7/docs/api/java/lang/Float.html
	private Float tipe_float_kelas;
	
	// Selengkapnya http://docs.oracle.com/javase/7/docs/api/java/lang/Double.html
	private Double tipe_double_kelas;	
	
	// Selengkapnya http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	private String tipe_string_kelas;
	
	// Selengkapnya http://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
	private Character tipe_char_kelas; 
	
	// Tipe Kelas dari kelas ini
	private TipeData tipeData;
	
}
