package jpmc;

public class ReverseString {
	public static String reverseString(String input)
	{
		if(input == null || input.isEmpty()) {
			return input;
			}
		char[] characters = input.toCharArray();
		int left =0;
		int right = characters.length -1;
		while (left < right) {
			//Swap characters
			char temp=characters[left];
			characters[left]=characters[right];
			characters[right] = temp;
			left++;
			right--;
			}
		return new String(characters);
	}
	public static void main(String[] args) {
		String originalString = "Sudha";
		String reverseString = reverseString(originalString);
		System.out.println("original String:" +originalString);
		System.out.println("Reversed String:" +reverseString);
		}
	}
