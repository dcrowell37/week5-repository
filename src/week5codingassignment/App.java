package week5codingassignment;
//Question 9
public class App {
	
	static Logger logger;

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
			
		logger.Log("Dylan");
		logger.Error("Crowell");
		
		logger2.Log("Dylan");
		logger2.Error("Crowell");
		
	}

}
