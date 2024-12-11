package Practice1;

 class ThroughClassname {

	//public static void main(String[] args) {

		
		static int num1=25;
		  static int num2=45;
		   
		 static public int addition()
		
		{
			int result=num1+num2;
			System.out.println("The result is:" +result);
			return result;
		}
			 public static void main(String[] args) 
			 {
				 System.out.println("DirectCalling");
				
				System.out.println("Do hardwork");
				int num1resp=num1;//direct calling by Through class n
				System.out.println("The num1 value is"+num1resp);
				
				int num2resp=num2;//num2 direct calling trough class name
				System.out.println("The num2 value is"+num2resp);
				
				addition();
		
 
 
		
			 class AddProgTest2{
				
				 // public static void main(String[] args)
			//{
					static  int num1=250;
					static  int num2=450;
					static public int addition()
					{
						
							int result=num1+num2;
							System.out.println("The result is:" +result);
							return result;
					}
			
			 public static void main(String[] args) {
				 System.out.println("Through class name");
				
				System.out.println("Do hardwork");
				int num1resp=AddProgTest2.num1;//direct calling by Through class n
				System.out.println("The num1 value is"+num1resp);
				
				int num2resp=AddProgTest2.num2;//num2 direct calling trough class name
				System.out.println("The num2 value is"+num2resp);
				
				AddProgTest2.addition();
						
	}

				
				}

			 }
 }
