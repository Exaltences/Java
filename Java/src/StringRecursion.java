
public class StringRecursion {

	public int length(String anyString) {

		if (anyString.isEmpty()) {

			return 0;
		}

		else {

			// Strip the string of its first character and add 1 to the length
			// for each character stripped.
			return length(anyString.substring(1, anyString.length())) + 1;
		}

	}

	public String reverse(String anyString) {

		if (anyString.isEmpty()) {

			return anyString;
		}

		else {

			// same logic as above method except with char at 0 since you want
			// to add the first character to the end of the string.
			return reverse(anyString.substring(1, anyString.length())) + anyString.charAt(0);
		}
	}

	public boolean isAPalindrome(String anyString) {

		anyString.toLowerCase();

		if (anyString.length() < 2) {

			return false;
		}

		if (anyString.charAt(0) == anyString.charAt(anyString.length() - 1)) {

			return true;
		}

		return isAPalindrome(anyString.substring(1, anyString.length() - 1));
	}
}