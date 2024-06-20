
public class validity {
	
	methods ob = new methods();
	
	validity(){
	}
	
	public boolean checkDigits(int number) {
		boolean condition = (number%10000==number) && (number%1000!=number);
		return condition;
	}
	
	// Assume 4 digit i/p
	public boolean checkZero(int number) {
		int[] arr = {ob.getDigit(number,0),ob.getDigit(number,1),ob.getDigit(number,2),ob.getDigit(number,3)};
		boolean condition = true;
		for(int x : arr) {
			if (x==0) {condition = false;}
		}
		return condition;
	}
	
	// Assume 4 digit i/p
	public boolean checkConsecutive(int number) {
		int[] arr = {ob.getDigit(number,0),ob.getDigit(number,1),ob.getDigit(number,2),ob.getDigit(number,3)};
		int[] arr_diff = {arr[1] - arr[0],arr[2] - arr[1],arr[3] - arr[2]};
		boolean condition = true;
		for(int x : arr_diff) {
			if (x==1) {condition = false;}
		}
		return condition;
	}
	
	// Assume 4 digit i/p
	public boolean checkUnique(int number) {
		int[] arr = {ob.getDigit(number,0),ob.getDigit(number,1),ob.getDigit(number,2),ob.getDigit(number,3)};
		boolean condition = true;
		for (int i=0;i<4;i++) {
			for (int j=i+1;j<4;j++) {
				if (arr[i]==arr[j]) {condition = false;}
			}
		}
		return condition;
	}
	
	public boolean checkValidity(int number) {
		
		if (!checkDigits(number)) {
			//System.out.println("Your number should have exactly 4 digits. ");
			return false;
		}
		else if (!checkZero(number)) {
			//System.out.println("Your number should not have the digit 0. ");
			return false;
		}
		else if (!checkUnique(number)) {
			//System.out.println("Your digits should be unique. ");
			return false;
		}
		else if (!checkConsecutive(number)) {
			//System.out.println("Your number should not have successive pairs of digits as consecutive. ");
			return false;
		}
		
		return true;
		
	}
	
}
