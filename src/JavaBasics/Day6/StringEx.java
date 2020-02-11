package JavaBasics.Day6;

public class StringEx {
	/*
	 * String: 
	 * unmodifiable or unchangeable
	 * 
	 * -- once string object is created it's data or state can't be changed, but creates a new string object is created
	 * -- It is immutable in nature (because of security reason)
	 * 
	 * Two ways to to create String:
	 * 1. Literal way: [String pool]
	 * 	String s1 = "TekArch";
	 * 2. Object way: using new key word [Heap memory]
	 * String s2 = new String("TekArch");
	 * 
	 * Note: we can achieve the mutability for String using StringBuffer (thread safe) or StringBuilder (non-thread safe)
	 * 
	 * Example:
	 * StringBuilder sb = new StringBuilder("TekArch");
	 * System.out.println(sb.toString); // TekArch
	 * sb.append("TekArch Technology");
	 * System.out.println(sb.toString());  // TekArch Technology
	 * 
	 * StringBuffer vs StringBilder (thread safe vs non thread safe)
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
