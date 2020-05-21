public class Loops {
    public static int findSequence(char[] symbols, int position) {
        char symbol = symbols[position];
        int count = 0;
        position++;
        while (position < symbols.length && symbols[position] != symbol) {
            count++;
            position++;
        }
        if (position == symbols.length)
            return -1;
        else
            return count;
    }
    
    public static String removeVowels(String str) {
        String result = "";
        boolean containsVowels = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ("aeiouyæøå".indexOf(c) == -1)
                result += c;
            else
                containsVowels = true;
        }
        if (containsVowels)
            return result;
        else
            return str;
    }
    
    public static void main(String[] args) {
        double numbers[] = {4.2, 1.8, 7.5, 1.9};
        
        double sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
        System.out.println(i);
        
    }
}
