package research_1.encode_decode;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Class Data Mixing
 * 
 * @author masfajar
 *
 */
public class Mix {

	/* Default frequency is 3 */
	private int frequency = 3;
	
	/* Filter character */
	private final String[] MASK_SEARCH_KEY = { "z", "Z", "s", "U", "=", "T",
			"i", "G", "b", "H", "w", "l", "F", "o", "I" };
	private final String[] MASK_REPLACE_KEY = { "~", "!", "#", "$", "%", "^",
			"&", "*", "(", ")", "-", "+", "?", "]", "[" };
	
	/* Singleton */
	private static Mix mix;

	public Mix() throws Exception {
		characterCheck();
	}
	
	public Mix(int frequency) throws Exception {
		characterCheck();
		this.frequency = frequency;
	}
	
	/**
	 * Method checking mask
	 * 
	 * @throws Exception
	 */
	private void characterCheck()throws Exception {
		if(MASK_SEARCH_KEY.length != MASK_REPLACE_KEY.length)
			throw new Exception("Length of character mask not same");
	}

	/**
	 * Method for changing string to base64
	 * 
	 * @param inputStr
	 * @return
	 */
	private String StringToBase64(String inputStr) {
		byte[] bytes = null;
		String strEncode = null;
		try {
			bytes = inputStr.getBytes("UTF-8");
			strEncode = Base64.getEncoder().encodeToString(bytes);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return strEncode;
	}

	/**
	 * Method for create fake key
	 * 
	 * @param str
	 * @return
	 */
	private String fakeKey(String str) {
		int i = 0;
		String fakeKey = str;
		for (String key : MASK_SEARCH_KEY) {
			fakeKey = fakeKey.replace(key, MASK_REPLACE_KEY[i]);
			i++;
		}
		return fakeKey;
	}

	/**
	 * Method for create ori key
	 * 
	 * @param str
	 * @return
	 */
	private String oriKey(String str) {
		int i = 0;
		String oriKey = str;
		for (String rep : MASK_REPLACE_KEY) {
			oriKey = oriKey.replace(rep, MASK_SEARCH_KEY[i]);
			i++;
		}
		return oriKey;
	}

	/**
	 * Method for changing base64 to string
	 * 
	 * @param StrBase64
	 * @return
	 */
	private String Base64ToString(String StrBase64) {
		byte[] decoded = Base64.getDecoder().decode(StrBase64);
		return new String(decoded);
	}

	/**
	 * Method encrypt public
	 * 
	 * @param inputStr
	 * @return
	 * @throws Exception
	 */
	public static String enc(String inputStr) throws Exception {
		if (mix == null)
			mix = new Mix();
		
		return mix.encode(inputStr);
	}

	/**
	 * Method decrypt public
	 * 
	 * @param inputStr
	 * @return
	 * @throws Exception
	 */
	public static String dec(String inputStr) throws Exception {
		if (mix == null)
			mix = new Mix();

		return mix.decode(inputStr);
	}

	/**
	 * Methode encode
	 * 
	 * @param inputStr
	 * @return
	 * @throws Exception
	 */
	public String encode(String inputStr) throws Exception {
		String shiftLeft = "";
		if (inputStr.length() < 1)
			throw new Exception("Input less than 1 in mix");
		else {
			shiftLeft = StringToBase64(inputStr);
			for (int i = 0; i < frequency; i++)
				shiftLeft = shiftLeft(shiftLeft);
		
			shiftLeft = fakeKey(shiftLeft);
		}
		return shiftLeft;
	}

	/**
	 * Methode decode
	 * 
	 * @param inputStr
	 * @return
	 */
	public String decode(String inputStr) {
		String oriStr = inputStr;
		oriStr = oriKey(oriStr);
		for (int i = 0; i < frequency; i++)
			oriStr = shiftRight(oriStr);
	
		return Base64ToString(oriStr);
	}

	/**
	 * Method for shift left text
	 * 
	 * @param s
	 * @return
	 */
	private String shiftLeft(String s) {
		return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
	}

	/**
	 * Method for shift right text
	 * 
	 * @param str
	 * @return
	 */
	private String shiftRight(String str) {
		return str.substring(1, str.length()) + str.charAt(0);
	}
}
