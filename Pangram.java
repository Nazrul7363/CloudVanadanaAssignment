class Pangram{
	
	static boolean isPangram(String str) {
		String strLower=str.toLowerCase();
		
		int[] freq=new int[26];
		
		for(char ch:strLower.toCharArray()) {
			 if (ch >= 97 && ch <= 122) {
			        freq[ch - 'a']++;
			    }
			
		}
		
		for(int count:freq) {
			//System.out.println((char)i++ +":"+count);
			if(count==0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		String str="The quick brown  fox jumps over the lazy dog";
		
		boolean output=isPangram(str);
		if(output){
			System.out.println("It is Pangram");
		}
		else{
			System.out.println("not Pangram");
		}
	}
}