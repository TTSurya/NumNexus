
public class methods {
	
	methods(){
	}
	
	public int getDigit(int num,int place) { //Works
		String text = "" + num;
		return text.charAt(place) - '0';
	}
	
	// To avoid ambiguous results avoid duplicate digits
	public int numC(int actual,int guess) { //Works
		int[] actualarr = {getDigit(actual,0),getDigit(actual,1),getDigit(actual,2),getDigit(actual,3)};
		int[] guessarr = {getDigit(guess,0),getDigit(guess,1),getDigit(guess,2),getDigit(guess,3)};
		int countC = 0;
		
		for (int dig : actualarr) {
			for (int dig2 : guessarr) {
				if (dig2==dig) {countC++;break;}
			}
		}
		return countC;
	}
	
	// To avoid ambiguous results avoid duplicate digits
	public int numP(int actual,int guess) { //Works
		int[] actualarr = {getDigit(actual,0),getDigit(actual,1),getDigit(actual,2),getDigit(actual,3)};
		int[] guessarr = {getDigit(guess,0),getDigit(guess,1),getDigit(guess,2),getDigit(guess,3)};
		int countP = 0;
		
		for (int x=0;x<4;x++) {
			if (actualarr[x]==guessarr[x]) {countP++;}
		}
		return countP;
	}
	
	public String textPC(int actual,int guess) { //Works
		int countP = numP(actual,guess);
		int countC = numC(actual,guess) - countP;
		
		String text = "P".repeat(countP) + "C".repeat(countC);
		return text;
	}
	
}
