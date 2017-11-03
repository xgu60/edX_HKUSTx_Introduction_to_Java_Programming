package comp102x.project.task;

public class CharValidator {
	
	public boolean validateChar(char c) {
		
		// Please write your code after this line
		char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		for (int i=0; i < 62; i++) {
		    if (charArray[i] == c) return true;
		  }
		return false; // This line should be modified or removed after finising the implementation of this method.
	}

}
