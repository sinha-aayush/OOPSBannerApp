public class UC6 {

    public static void main(String[] args) {
        // Retrieve the patterns for the letters
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // The banner prints "OOPS" (O, O, P, S)
        // We loop through each of the 7 rows
        for (int i = 0; i < 7; i++) {
            System.out.println(
                oPattern[i] +  
                oPattern[i] +  
                pPattern[i] + 
                sPattern[i]
            );
        }
    }

    // Pattern for 'O' with side thickness
    public static String[] getOPattern() {
        return new String[] {
            "   ***  ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            "   ***  "
        };
    }

    // Pattern for 'P' with a solid left bar
    public static String[] getPPattern() {
        return new String[] {
            "  ****** ",
            "**   ** ",
			"**    ** ",
            "**   ** ",
            "****** ",
            "**     ",
            "**     ",
            " **     "
        };
    }

    // Pattern for 'S' with top, middle, and bottom bars
    public static String[] getSPattern() {
        return new String[] {
            "  ****** ",
            "**     ",
            "**     ",
            " ***** ",
            "     ** ",
            "      **",
            "  ******"
        };
    }
}