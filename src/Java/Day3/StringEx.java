package Java.Day3;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="java"; // literal  -> only one object gets created in string constant pool and one reference
		String str2="java";  // no new object gets created in string constant pool and new reference str2 is pointed to existing object
		String s1 = new String("Java");// with new keyword (2 objects gets created one in regular heap memory and other in string constant pool and 1 reference)
		String s2 = new String("Java");// with new keyword  (no new object is created, s2 will be referencing to existing object created in string constant pool))

		System.out.println("str1.equals(str2) : " + str1.equals(str2)); 
		System.out.println("str1==str2 : " + (str1==str2)); 
		System.out.println("s1.equals(s2) :" + s1.equals(s2)); 
		System.out.println("s1==s2 : " + (s1==s2));
		
		System.out.println("str1 hash code = " + str1.hashCode());
		System.out.println("str2 hash code = " + str2.hashCode());
		System.out.println("  s1 hash code = " + s1.hashCode());
		System.out.println("  s2 hash code = " + s2.hashCode());

	}

}
