/*
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.

*/


class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text=text;
    }
    public boolean ifPalindrom() {
        for(int i=0;i<this.text.length()/2;i++){
			if(this.text.charAt(i)!=this.text.charAt(this.text.length()-i-1)){
				return false;
			}
		}
		return true;
    }
	
    public void displayResult() {
		System.out.printf("The given text: "+text+" is palindrom "+ifPalindrom());
    }
}

public class PalindromeCheckerDemo {
    public static void main(String[] args) {
        // Creating objects of the PalindromeChecker class
        PalindromeChecker pc = new PalindromeChecker("abbccbba");

        pc.displayResult();
    }
}
