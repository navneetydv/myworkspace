package basic;

public class pelindrome {

	public static void main(String[] args) {
		
//	}
//		public static void main(int s) {
//			
//		}
//		
//		public static void main() {
//			
		
		
    String str="madam";
    String ab= " ";
    		for (int i =str.length()-1; i>=0; i--) {
    		ab=ab+str.charAt(i);
    	
			}
    		if(ab.contains(str)) {
    			System.out.println("given word is pelindrome");
    		}else {
    			System.out.println("given word is not pelindrome");
    		}
	}

}
