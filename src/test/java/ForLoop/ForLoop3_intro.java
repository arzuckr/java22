package ForLoop;

public class ForLoop3_intro {
    public static void main(String[] args) {

        String str = "Java is getting very easy to work with!";
        //print the count of letter 't' from the string above.

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 't') {
                count++;


            }
        }
        System.out.println(count);//2,way
        // 1. I would check each letter in a string
        // 2. Everytime I encounter letter `t`, I would increase the count of letter t.
        // 3. To store the count of letter I would create a variable.
        // 4. To check each letter in a string I would use loop.
        int countOfLetterT = 0;
        // The range of values that I need to look starts from 0 and goes up to length of string.
        // as an index length of string is not included.
        for (int i = 0; i < str.length(); i++) {
            // How could I check the letter at index number i?
            char currentCharacter = str.charAt(i);
            // If the current character is  `t`, then I would increase the count of letter t.
            if (currentCharacter == 't') {
                countOfLetterT++;

            }
        }
    }}