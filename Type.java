import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Type {

	/*Timer timer; 
	
	 public Type ( int seconds )   {
		    timer = new Timer () ;
		    timer.schedule ( new ToDoTask () , seconds*1000 ) ;
		  }
	 
	 class ToDoTask extends TimerTask  {
		    public void run ()   {
		     
		      System.out.println ( "Times up!" ) ;
		      timer.cancel () ; //Terminate the thread
		    }
		  }
	*/
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in); // creates Scanner class
		
		//long startTime = System.currentTimeMillis();

		//String time = "You have 5 seconds.";
		String TEST = "Type this sentence exactly as it's written" ;
		
		System.out.println(TEST);
		//System.out.println("\n");
		//new Type(5) ;
		
		
		if(s.nextLine().equals(TEST))	// if you use ==, it refers to memory location which makes it wrong
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Wrong ");
		}
		
		
		
	}

}
