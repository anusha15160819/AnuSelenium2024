package Practice1;

public class DirectcallingBYnames18 {

	

		

			//public static void main(String[] args) {
	
	
				
				static int num1=25;
				  static int num2=45;
				   
				static  public int addition()
				
				{
					int result=num1+num2;
					System.out.println("The result is:" +result);
					return result;
				
				}
				  public static void main(String[] args)
					{
						
						System.out.println("Do hardwork");
						int num1resp=num1;//direct calling by names
						System.out.println("The num1 value is"+num1resp);
						
						int num2resp=num2;//num2 direct calling by names
						System.out.println("The num2 value is"+num2resp);
						
						addition();
				}
	}
				
			
	


