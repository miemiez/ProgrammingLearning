import java.util.regex.*;
public class TestRegularExpression{
	public static void main(String[] args) {
		String s = "<span><b>hello world</b></span>";
		String pattern = "(\\<.*?>)(\\<.*?>)(\\bhello world\\b)(\\<.*?>)(\\<.*?>)";
		
		//创建Pattern对象
		Pattern p = Pattern.compile(pattern);
		
		//创建Matcher对象
		Matcher m = p.matcher(s);
		
		int gp = m.groupCount();
		System.out.println(gp);
		if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	         System.out.println("Found value: " + m.group(3) ); 
	         System.out.println("Found value: " + m.group(4) ); 
	         System.out.println("Found value: " + m.group(5) ); 
	      } else {
	         System.out.println("NO MATCH");
	    }
		
	}
}