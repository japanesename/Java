package casebreak;

public class marks {
		  public static void main(String[] args){
		  char grade = 'B';
		  switch ( grade )
		  {
		    case 'A':
		      System.out.println( "Topper" );
		      break ;
		    case 'B':
		      System.out.println( "Merit" );
		      break ;
		    case 'C':
		      System.out.println( "Good" );
		      break ;
		    case 'D':
		      System.out.println( "Average" );
		      break ;
		    case 'E':
		      System.out.println( "Pass" );
		      break ;
		    case 'F':
		      System.out.println( "FAIL" );
		      break ;
		    default :
		      System.out.println( "No grade given" );
		  }
		}
}
