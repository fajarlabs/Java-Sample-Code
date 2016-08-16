package experiment_2.lexical_analizer;

import java.util.ArrayList;
import java.util.List;

/**
 * Membuat lexical analyzer
 * 
 * @author masfajar
 *
 */

public class BasicLexer {
	
	/* Keyword program */
	public static final String[] keywords = { "abstract", "continue", "for",
			"new", "switch", "assert", "default", "goto", "package",
			"synchronized", "boolean", "do", "if", "private", "this", "break",
			"double", "implements", "protected", "throw", "byte", "else",
			"import", "public", "throws", "case", "enum", "instanceof",
			"return", "transient", "catch", "extends", "int", "short", "try",
			"char", "final", "interface", "static", "void", "class", "finally",
			"long", "strictfp", "volatile", "const", "float", "native",
			"super", "while", "echo" };

	public static enum Type {
		// Skema bahasa program
		LEFT_BRACE, // {
		RIGHT_BRACE, // }
		LEFT_ROUND_BRACKET, // (
		RIGHT_ROUND_BRACKET, // )
		LEFT_SQUARE_BRACKET, // [
		RIGHT_SQUARE_BRACKET, // ]
		SEMI_COLON, // ;
		COLON, // :
		PLUS, // +
		MINUS, // -
		SLASH, // /
		ASTERISK, // *
		QUESTION_MARK, // ?
		PERCENT_SIGN, // %
		SINGLE_LEFT_POINTING_ANGLE_QUOTATION_MARK, // <
		SINGLE_RIGHT_POINTING_ANGLE_QUOTATION_MARK, // >
		LEFT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK, // <<
		RIGHT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK, // >>
		AMPERSAND, // &
		EQUAL_SIGN, // =
		DOUBLE_QUOTE, // "
		ATOM, // Content
		C_KEYWORD; // KEYWORD
	}

	public static class Token {
		public final Type t;
		public final String c; // Kontent utama token

		/* kolom token */
		public Token(Type t, String c) {
			this.t = t;
			this.c = c;
		}

		@Override
		public String toString() {
			if (t == Type.ATOM) {
				// return "ATOM<" + c + ">";
				return c;
			}

			if (t == Type.C_KEYWORD) {
				return "KEYWORD<" + c + ">";
			}

			return t.toString();
		}
	}

	/*
	 * dapatkan string dan ukuran hasilnya
	 */
	public static String getAtom(String s, int i) {
		int j = i;
		for (; j < s.length();) {
			if (Character.isLetter(s.charAt(j))) {
				j++;
			} else {
				return s.substring(i, j);
			}
		}
		return s.substring(i, j);
	}

	public static List<Token> lex(String input) {
		List<Token> result = new ArrayList<Token>();
		for (int i = 0; i < input.length();) {
			switch (input.charAt(i)) {
			case '(':
				result.add(new Token(Type.LEFT_ROUND_BRACKET, "("));
				i++;
				break;
			case ')':
				result.add(new Token(Type.RIGHT_ROUND_BRACKET, ")"));
				i++;
				break;
			case '{':
				result.add(new Token(Type.LEFT_BRACE, "{"));
				i++;
				break;
			case '}':
				result.add(new Token(Type.RIGHT_BRACE, "}"));
				i++;
				break;
			case ';':
				result.add(new Token(Type.SEMI_COLON, ";"));
				i++;
				break;
			case '"':
				result.add(new Token(Type.DOUBLE_QUOTE, "\""));
				i++;
				break;
			default:
				if (Character.isWhitespace(input.charAt(i))) {
					i++;
				} else {
					// Cari keyword
					Boolean flag = false;
					String keywordComp = "";
					for (String keyword : keywords) {
						int k = i;
						StringBuilder sb = new StringBuilder();
						for (int m = 0; m < keyword.length(); m++) {
							try {
								char ckeyword = input.charAt(k);
								sb.append(ckeyword);
							} catch (Exception e) {
							}
							k++;
						}

						String cKeywordCompair = sb.toString();
						if (keyword.equals(cKeywordCompair)) {
							result.add(new Token(Type.C_KEYWORD,
									cKeywordCompair));
							flag = true;
							keywordComp = keyword;
							break;
						} else
							flag = false;
						sb.setLength(0);
						sb = null;
					}

					if (flag) {
						i += keywordComp.length();
					} else {
						// Konten program
						String atom = getAtom(input, i);
						i += atom.length();
						result.add(new Token(Type.ATOM, atom));
					}
				}
				break;
			}
		}
		return result;
	}

	public void program(String language) {
		List<Token> tokens = lex(language);
		int flagDouble = 0;
		int indexToken = 0;
		for (Token t : tokens) {
			System.out.println(t.toString());
			if (Type.DOUBLE_QUOTE.toString().equals(t.toString())) {
				flagDouble += 1;
			}

			if (flagDouble == 2) {
				flagDouble = 0; /* reset flag untuk double quotes */
				System.out.println(tokens.get(indexToken - 1));
			}

			indexToken++;
		}
	}
}
