package Day132Java练习50;

public class 中文转Unicode码 {
	public static String getStrUnicode(String inStr) {
		StringBuffer unicode = new StringBuffer();
		char c; 
		int bit; 
		String tmp = null; 
		for (int i = 0; i < inStr.length(); i++) { 
			c = inStr.charAt(i);
			if (c > 255) { 
				unicode.append("\\u"); 
				bit = (c >>> 8);
				tmp = Integer.toHexString(bit); 
				if (tmp.length() == 1) unicode.append("0"); 
				unicode.append(tmp); 
				bit = (c & 0xFF); 
				tmp = Integer.toHexString(bit); 
				if (tmp.length() == 1) unicode.append("0"); 
				unicode.append(tmp); 
			}else { 
				unicode.append(c); 
			} 
		} 
		return (new String(unicode)); 
	} 
	
	public static void main(String[] args) { 
		String str = "Hello 中国"; 
		System.out.println("转码前:" + str); 
		System.out.println("转码后:" + getStrUnicode(str)); 
	}
}
