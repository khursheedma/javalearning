package Java.Day3;
// Strings
public class Entry3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello how are you";
		System.out.println(s.length());
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println(s.indexOf('r'));
		System.out.println(s.replace('y', 'x'));
		
		System.out.println();
		
		String v = "abc\tdef" + "xyz";   // tab (\t)
		System.out.println(v);
		
		String v1 = "abc\bdef" + "xyz";   //  (\b)
		System.out.println(v1);
		
		// look for different string methods
		
		// string is immutable
		
		/*
		  	there can not be more than 1 string with same value in memory
			string can not change value, instead a new string is formed always, when edited
			for security reason (strings are used for password etc)
		 */
		
		String str1 = "Hello";
		String str2 = "Hi";
		String str3 = str2;
		str3 = str3 + "something";
		
		System.out.println("immutable example");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		// string builder is mutable
	}

}
