package advanced_2.regex_dasar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDasar {
	
	public void lihatHasil() {
		// Docs http://www.tutorialspoint.com/java/java_regular_expressions.htm
		
		String TelkomesiRegExp = "^(\\+62|\\+0|0|62)8(1[123]|52|53|21|22|23)[0-9]{5,9}$";
		String SimpatiRegExp = "^(\\+62|\\+0|0|62)8(1[123]|2[12])[0-9]{5,9}$";
		String AsRegExp = "^(\\+62|\\+0|0|62)8(52|53|23)[0-9]{5,9}$";
		String IndosatRegExp = "^(\\+62815|0815|62815|\\+0815|\\+62816|0816|62816|\\+0816|\\+62858|0858|62858|\\+0814|\\+62814|0814|62814|\\+0814)[0-9]{5,9}$";
		String Im3RegExp = "^(\\+62855|0855|62855|\\+0855|\\+62856|0856|62856|\\+0856|\\+62857|0857|62857|\\+0857)[0-9]{5,9}$";
		String XlRegExp = "^(\\+62817|0817|62817|\\+0817|\\+62818|0818|62818|\\+0818|\\+62819|0819|62819|\\+0819|\\+62859|0859|62859|\\+0859|\\+0878|\\+62878|0878|62878|\\+0877|\\+62877|0877|62877)[0-9]{5,9}$";
		
		// Tes disini 
		Pattern pattern = Pattern.compile(TelkomesiRegExp); // True
		Matcher matcher = pattern.matcher("+62852347130300");
		System.out.println("Input String matches regex - "+matcher.matches());
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		RegexDasar regexDasar = new RegexDasar();
		regexDasar.lihatHasil();
	}

}
