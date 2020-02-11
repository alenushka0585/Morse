package morse;

public class MorseToEnglish {
    public static String stringToEnglish(String text) {
        String newEnglish = "";
        String selectedEnglish;
        String convertedEnglish;
        String[] morseChars = text.split(" ");

        for (int i = 0; i < morseChars.length; i++) {
            selectedEnglish = morseChars[i];
            boolean endsWithWordSeparator = selectedEnglish.endsWith("|");

            if (endsWithWordSeparator){
                selectedEnglish = selectedEnglish.substring(0, selectedEnglish.length() - 1);
            }

            convertedEnglish = decodeToEnglish(selectedEnglish);
            newEnglish = newEnglish  + convertedEnglish;

            if (endsWithWordSeparator) {
                newEnglish = newEnglish + " ";
            }
        }

        return newEnglish;
    }

    public static String decodeToEnglish (String decode) {
        if (decode.equalsIgnoreCase(".-"))
            decode = "a";
        else if (decode.equalsIgnoreCase("-..."))
            decode = "b";
        else if (decode.equalsIgnoreCase("-.-."))
            decode = "c";
        else if (decode.equalsIgnoreCase("-.."))
            decode = "d";
        else if (decode.equalsIgnoreCase("."))
            decode = "e";
        else if (decode.equalsIgnoreCase("..-."))
            decode = "f";
        else if (decode.equalsIgnoreCase("--."))
            decode = "g";
        else if (decode.equalsIgnoreCase("...."))
            decode = "h";
        else if (decode.equalsIgnoreCase(".."))
            decode = "i";
        else if (decode.equalsIgnoreCase(".---"))
            decode = "j";
        else if (decode.equalsIgnoreCase("-.-"))
            decode = "k";
        else if (decode.equalsIgnoreCase(".-.."))
            decode = "l";
        else if (decode.equalsIgnoreCase("--"))
            decode = "m";
        else if (decode.equalsIgnoreCase("-."))
            decode = "n";
        else if (decode.equalsIgnoreCase("---"))
            decode = "o";
        else if (decode.equalsIgnoreCase(".--."))
            decode = "p";
        else if (decode.equalsIgnoreCase("--.-"))
            decode = "q";
        else if (decode.equalsIgnoreCase(".-."))
            decode = "r";
        else if (decode.equalsIgnoreCase("..."))
            decode = "s";
        else if (decode.equalsIgnoreCase("-"))
            decode = "t";
        else if (decode.equalsIgnoreCase("..-"))
            decode = "u";
        else if (decode.equalsIgnoreCase("...-"))
            decode = "v";
        else if (decode.equalsIgnoreCase(".--"))
            decode = "w";
        else if (decode.equalsIgnoreCase("-..-"))
            decode = "x";
        else if (decode.equalsIgnoreCase("-.--"))
            decode = "y";
        else if (decode.equalsIgnoreCase("--.."))
            decode = "z";
        else if (decode.equalsIgnoreCase("-----"))
            decode = "0";
        else if (decode.equalsIgnoreCase(".----"))
            decode = "1";
        else if (decode.equalsIgnoreCase("..---"))
            decode = "2";
        else if (decode.equalsIgnoreCase("...--"))
            decode = "3";
        else if (decode.equalsIgnoreCase("....-"))
            decode = "4";
        else if (decode.equalsIgnoreCase("....."))
            decode = "5";
        else if (decode.equalsIgnoreCase("-...."))
            decode = "6";
        else if (decode.equalsIgnoreCase("--..."))
            decode = "7";
        else if (decode.equalsIgnoreCase("---.."))
            decode = "8";
        else if (decode.equalsIgnoreCase("----."))
            decode = "9";
        else if (decode.equalsIgnoreCase("|"))
            decode = " ";
        else if (decode.equalsIgnoreCase("......"))
            decode = ".";
        else if (decode.equalsIgnoreCase(".-.-.-"))
            decode = ",";
        else if (decode.equalsIgnoreCase("..--.."))
            decode = "?";
        else if (decode.equalsIgnoreCase("-.-.-"))
            decode = ";";
        else if (decode.equalsIgnoreCase("---..."))
            decode = ":";
        else if (decode.equalsIgnoreCase("-..-."))
            decode = "#";
        else if (decode.equalsIgnoreCase(".-..-."))
            decode = "\"";
        else if (decode.equalsIgnoreCase(".----."))
            decode = "\'";
        else if (decode.equalsIgnoreCase("--..--"))
            decode = "!";
        else if (decode.equalsIgnoreCase("-..-."))
            decode = "/";
        else if (decode.equalsIgnoreCase("-....-"))
            decode = "-";
        else if (decode.equalsIgnoreCase("-.--.-"))
            decode = "()";

        return decode;
    }
}
