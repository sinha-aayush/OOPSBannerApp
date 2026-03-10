public class UC8 {
    public static void main(String[] args) {
        displayBanner("OOPS");
    }

    public static void displayBanner(String message) {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < message.length(); j++) {
                char c = message.charAt(j);
                String[] pattern = getPattern(c);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    public static String[] getPattern(char c) {
        switch (Character.toUpperCase(c)) {
            case 'O':
                return new String[]{
                    "  ****  ",
                    " *    * ",
                    " *    * ",
                    " *    * ",
                    " *    * ",
                    " *    * ",
                    "  ****  "
                };
            case 'P':
                return new String[]{
                    " *****  ",
                    " *    * ",
                    " *    * ",
                    " *****  ",
                    " *      ",
                    " *      ",
                    " *      "
                };
            case 'S':
                return new String[]{
                    "  ***** ",
                    " *      ",
                    " *      ",
                    "  ****  ",
                    "      * ",
                    "      * ",
                    " *****  "
                };
            default:
                return new String[]{
                    "        ", 
                    "        ", 
                    "        ", 
                    "        ", 
                    "        ", 
                    "        ", 
                    "        "
                };
        }
    }
}
