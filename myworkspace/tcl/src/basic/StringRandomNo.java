package basic;

public class StringRandomNo {
	
	public static void main(String[] args) {
	
		String word="yusuf";
		for (int i=0; i<word.length(); i++) {
			
			int asciiOfword= word.charAt(i);
			char nextword=(char)( asciiOfword+1);
			System.out.println(nextword);
			
		}
		
		
	}

}
