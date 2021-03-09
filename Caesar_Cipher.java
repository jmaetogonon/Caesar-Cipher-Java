package jm1;

public class Caesar_Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass = "mabasa123";
		System.out.println(Encipher(pass, 3));
		System.out.println(Decipher(pass, 3));

	}
	public static String Encipher(String pass, int shift) {
		String cipheredtext = "";
		char newchar;
		char[] chArray = new char[pass.length()]; 
		// Copy character by character into array 
        for (int i = 0; i < pass.length(); i++) { 
        	chArray[i] = pass.charAt(i); 
        } 
		for (char ch: chArray) {
			if (!Character.isLetter(ch)) {
				cipheredtext += ch;
			}
			else {
				if (Character.isUpperCase(ch)) {
					newchar = (char)(((int)ch + shift - 65) % 26 + 65);
					cipheredtext += newchar;
				}
				else {
					newchar = (char)(((int)ch + shift - 97) % 26 + 97);		
					cipheredtext += newchar;
				}
			}
		}
		return cipheredtext;		
	}
	public static String Decipher(String pass, int shift) {
		String cipheredtext = "";
		char newchar;
		char[] chArray = new char[pass.length()]; 
		// Copy character by character into array 
        for (int i = 0; i < pass.length(); i++) { 
        	chArray[i] = pass.charAt(i); 
        } 
		for (char ch: chArray) {
			if (!Character.isLetter(ch)) {
				cipheredtext += ch;
			}
			else {
				if (Character.isUpperCase(ch)) {
					newchar = (char)(((int)ch + (26 - shift) - 65) % 26 + 65);
					cipheredtext += newchar;
				}
				else {
					newchar = (char)(((int)ch + (26 - shift) - 97) % 26 + 97);	
					cipheredtext += newchar;
				}
			}
		}
		return cipheredtext;		
	}
	
	

}
