//import java.io.PrintStream;
//import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
//import java.nio.charset.Charset;

public class Hello {

	public static void main(String[] args) throws UnsupportedEncodingException {
		int value1=1,value2;
		value2=value1+2;
		int max=2147483647;
		float value4=9f/2;
		double value5=9d;
		
		/*PrintWriter printWriter = new PrintWriter(System.out,true);
		char aa = '\u1FB9';
		printWriter.println("aa = " + aa);
		
		String cc2 = "2202";
		  String text2 = String.valueOf(Character.toChars(Integer.parseInt(cc2, 16)));
		int cc = 0x2202;
		char ccc = (char) Integer.parseInt(String.valueOf(cc), 16);
		final String text = String.valueOf(ccc);
		
		String st="2202";
		int cp=Integer.parseInt(st,16);// it convert st into hex number.
		char c[]=Character.toChars(cp);
		System.out.println(c);
		 int codePoint = '\u2202';
		    String s = Character.toString(codePoint); // <<< Requires JDK 11 !!!
		    System.out.println(s);
		    
		//working but not proper result
		String var1="\u26C4";
		
		  byte[] sourceBytes = var1.getBytes("UTF-8");
		    String data = new String(sourceBytes);

		    PrintStream out = new PrintStream(System.out,true);
		    out.println(data);*/
		
		    char var2='\u0496';
		    System.out.println(var2);
		
		
		
		System.out.println(value2);
		System.out.println(max);
		System.out.println(value4);
		System.out.println(value5);
	}

}
