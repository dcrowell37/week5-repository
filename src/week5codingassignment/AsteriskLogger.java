package week5codingassignment;
// Question 3
//a
public class AsteriskLogger implements Logger {
//Question 4
	@Override
	public void Log(String Log) {
		System.out.println("***" + Log + "***");
		
	}
//Question 5
	@Override
	public void Error(String Error) {
		System.out.println("***************");
		System.out.println("***Error: " + Error + "***");
		System.out.println("***************");
		
	}

}
