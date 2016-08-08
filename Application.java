import research_2.lexical_analizer.BasicLexer;


public class Application {
	public static void main(String[] args) throws InterruptedException {
			BasicLexer basicLexer = new BasicLexer();
			basicLexer.program("class Hello { void sapa(){echo \"helloWorld\"; }}");
	}
}
