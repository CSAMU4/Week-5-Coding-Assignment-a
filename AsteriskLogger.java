
// 1. Create an interface named Logger. 
interface Logger {

// 2. Add two void methods to the Logger interface, each should take a String argument 	
	String word = "Jeff"; 
	
	void Log(); // ***Jeff***
	void Error(); // create the border around ***Error: Jeff*** 
	
	
}
// 3. Create two classes that implements the Logger interface. ***added unimplemented methods to generate the override underneath the main method
	// the first class is called AsteriskLogger 
public class AsteriskLogger implements Logger {

	public String message; // extracted the method that builds the message and created a constant method 
	public String messageTwo; 

	public static void main(String[] args) {
		System.out.println(word); 
		System.out.println("\n"); 
		
		AsteriskLogger ex = new AsteriskLogger(); 
		ex.Log();
		ex.Error();
	}	

	@Override
	public void Log() {
		message = "***" + word + "***";
		messageTwo = "***" + "Error:" + " " + word + "***"; 
		
		System.out.println(message);
		System.out.print("\n");
		
		System.out.println(messageTwo);
		System.out.print("\n");
			
	}

	@Override
	public void Error() {
		String border = messageTwo; 
		String stars = ""; 
			int i = 0; 
				for (i = 0; i < border.length(); i++) stars +="*"; 
		 
		 	System.out.println(stars + "\n" + border + "\n" + stars); 		
	}

	}
