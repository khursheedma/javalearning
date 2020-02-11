package Java.Day4;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str2 = new String("Vinod");  // new obj1
		String str3 = new String("Vinod");  // new obj2
		
		// String str3 = str2;  // same obj1
		
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(str2.equals(str3));
		System.out.println(str3 == str2);
		
		
		String s2 = "Vinod";
		String s3 = "Vinod";
		
		System.out.println(s2.equals(s3));
		System.out.println(s3 == s2);
		
		
	}

}
