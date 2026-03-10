public class UC7 {

    public static void main(String[] args) {
        // The word we want to display
        String input = "OOPS";

        // 1. Create patterns for each letter (7 lines high)
        // These match the visual style shown in your image
        String[] patternO = {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        };

        String[] patternP = {
            "****** ",
            "**   **",
            "**   **",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        };

        String[] patternS = {
            " ******",
            "**     ",
            "**     ",
            " ***** ",
            "     **",
            "     **",
            "****** "
        };

        // 2. Store them in an array of CharacterPatternMap objects
        // This follows the OOPS principle of encapsulation and scalability
        CharacterPatternMap[] maps = {
            new CharacterPatternMap('O', patternO),
            new CharacterPatternMap('P', patternP),
            new CharacterPatternMap('S', patternS)
        };

        // 3. Logic to print side-by-side
        // We iterate through each of the 7 rows
        for (int i = 0; i < 7; i++) {
            // For each row, we check every character in our input word
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                
                // Find the matching pattern in our maps array
                for (int k = 0; k < maps.length; k++) {
                    if (maps[k].getCharacter() == currentChar) {
                        // Print the specific row of that character's pattern
                        System.out.print(maps[k].getPattern()[i] + "  ");
                        break; 
                    }
                }
            }
            // Move to the next line after printing the row for all characters
            System.out.println();
        }
    }

    /**
     * Inner class that encapsulates the character and its pattern.
     * This makes the code scalable: to add new letters, you only need
     * to create a new instance of this class.
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}