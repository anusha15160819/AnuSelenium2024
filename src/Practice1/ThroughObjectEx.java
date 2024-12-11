package Practice1;

public class ThroughObjectEx {

	//public static void main(String[] args)
	//{

		 int num1=35;
		 int num2=45;
		String hardwork="Job";
		
		 public int addition() {
			int result = num1+num2;
			System.out.println("the result is" +result);
					return result;
		}
	
	 public class Addprogtest{
		 public static void main(String[]args)
		 {
			 ThroughObjectEx prog=new ThroughObjectEx();
			 int num1resp=prog.num1;
			 System.out.println("Num1 value is "+num1resp);
			 
			 int num2resp=prog.num2;
			 System.out.println("Num2 value is "+num2resp);
			 
			 prog.addition();
			 
		 }
		
	}

}
