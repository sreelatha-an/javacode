
public class Launch12 
{
	public static void main(String[] args) 
	{
		    String original = "Telusko";
	        String reversed = reverseString(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }
        // Java ==> avaJ ,  Telusko ==> oksuleT
	    public static String reverseString(String str) {
	        char[] charArray = str.toCharArray();
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            // Swap characters at the left and right positions
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;

	            // Move the pointers towards each other
	            left++;
	            right--;
	        }

	        return new String(charArray);

	}

}
