public class Triangle {

  public static void main(String[] args) {
    int rows = 5;
    {
    for(int k=0; k<rows; k++)   
    {   
    for(int j=0; j<=k; j++)   
    {   
    System.out.print("* ");   
    }   
    System.out.println();   
    for (int i = rows; i >= 1; i--) {
    	
    	for(int j = i; j>= 1; j--) {
    		System.out.print("* ");
    	}
    	
    	System.out.println();
    }

    }
  }
