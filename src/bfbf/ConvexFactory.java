package bfbf;

import bfbf.Palindrome;

public class ConvexFactory extends PalindromeFactory<ConvexPalindrome> {

	@Override
	public ConvexPalindrome make(Palindrome center, Palindrome wrap) {
		return new ConvexPalindrome((BFBPalindrome) center, (ConvexPalindrome) wrap);
	}

}
