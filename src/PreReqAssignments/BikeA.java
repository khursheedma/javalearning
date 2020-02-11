package PreReqAssignments;

class BikeA {
	 int speedlimit=90;
}
class BikeB extends BikeA{  
	 int speedlimit=150;  

public static void main(String args[]){  
	BikeA obj=new BikeB();  
	System.out.println(obj.speedlimit);//90  
}  
}