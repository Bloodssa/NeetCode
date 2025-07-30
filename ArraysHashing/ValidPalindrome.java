package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args){
        String s = "madam!!!!!!!!";

        SolutionPalindrome sp = new SolutionPalindrome();

        boolean result = sp.isPalindrome(s);

        System.out.println(result);
    }
}

class SolutionPalindrome {
    public boolean isPalindrome(String s) {
        
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(filtered).reverse().toString();

        return filtered.equals(reversed);
    }
}