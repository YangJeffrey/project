public class fibonacci {

	public static void main(String[] args) 
	{
		 int maxNumber = 47; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
		 if (maxNumber > 47) {
			 System.out.println("Integer overflow if maxNumber > 47");
		 } else {
			 for (int i = 1; i <= maxNumber; ++i)
		        {
		            System.out.println(previousNumber+" ");
		      
		            int sum = previousNumber + nextNumber;
		            previousNumber = nextNumber;
		            nextNumber = sum;
		        }
		 }

	}

}
