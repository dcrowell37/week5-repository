package week5codingassignment;
//Question 3
//b
public class SpacedLogger implements Logger {
	//Question 6
	StringBuilder newString1 = new StringBuilder();
	StringBuilder newString2 = new StringBuilder();
	
	@Override
	public void Log(String Log) {
		for (int i = 0; i < Log.length(); i++) {
				newString1 = newString1.append(Log.charAt(i));
				if(i == Log.length() - 1)
					break;
				newString1 = newString1.append(' ');
		}
		//Question 7
		System.out.println(newString1.toString());
		
	}

	@Override
	public void Error(String Error) {
		//Question 8
		for (int i = 0; i < Error.length(); i++) {
			newString2 = newString2.append(Error.charAt(i));
			if(i == Error.length() - 1)
				break;
			newString2 = newString2.append(' ');
	}
	System.out.println("ERROR: " + newString2.toString());
		
	}

}
