package be.vdab.lambdas.textapp;

/**
 * Hello world!
 *
 */
public class TextApp 
{
    public static void main( String[] args )
    {
       Text text = new Text("Dit is een nieuwe zin");
       //text.printFilteredWords(s -> s.length() < 3);
       text.printFilteredWords(TextApp::wordsContainingE);
    }
    
    public static boolean wordsContainingE(String s) {
    	return s.contains("e");
    }
}
