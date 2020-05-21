public class ArrayTasks {
    public static boolean isPalindrome(String s, boolean ignoreCase) {
        if (ignoreCase) {
            s = s.toLowerCase();
        }
        for (int i = 0; i < (s.length() + 1) / 2; i++) {
            int mirrorPos = s.length() - 1 - i;
            if (s.charAt(i) != s.charAt(mirrorPos)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("melkekleM", true));
    }
}
