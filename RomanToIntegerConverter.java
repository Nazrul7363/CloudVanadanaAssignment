import java.util.*;

public class RomanToIntegerConverter {
	
	Map<Character, Integer> map = new HashMap<>();
	public RomanToIntegerConverter() {
		
    	map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
	
	int romanToInt(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = map.get(str.charAt(i));
            if (i + 1 < str.length()) {
                int s2 = map.get(str.charAt(i + 1));
                if (s1 >= s2) {
                    sum = sum + s1;
                } else {
                    sum = sum - s1;
                }
            } else {
                sum = sum + s1;
            }
        }
        return sum;
    }
	
    public static void main(String args[]) {
        RomanToIntegerConverter obj = new RomanToIntegerConverter();
        String inputRoman = "LX";
        System.out.println("The Integer value of "
        		+ "given Roman number is: " + obj.romanToInt(inputRoman));
    }
}
