package morse;

public class MorseToRussian {
    public static String stringToRussian(String text) {
        String newRussian = "";
        String selectedRussian;
        String convertedRussian;
        String[] morseChars = text.split(" ");

        for (int i = 0; i < morseChars.length; i++) {
            selectedRussian = morseChars[i];
            boolean endsWithWordSeparator = selectedRussian.endsWith("|");

            if (endsWithWordSeparator){
                selectedRussian = selectedRussian.substring(0, selectedRussian.length() - 1);
            }

            convertedRussian = decodeToRussian(selectedRussian);
            newRussian = newRussian  + convertedRussian;

            if (endsWithWordSeparator) {
                newRussian = newRussian + " ";
            }
        }

        return newRussian;
    }

    public static String decodeToRussian(String decode){
        if (decode.equalsIgnoreCase(".-"))
            decode = "а";
        else if (decode.equalsIgnoreCase("-..."))
            decode = "б";
        else if (decode.equalsIgnoreCase("-.-."))
            decode = "ц";
        else if (decode.equalsIgnoreCase("-.."))
            decode = "д";
        else if (decode.equalsIgnoreCase("."))
            decode = "е";
        else if (decode.equalsIgnoreCase("..-."))
            decode = "ф";
        else if (decode.equalsIgnoreCase("--."))
            decode = "г";
        else if (decode.equalsIgnoreCase("...."))
            decode = "х";
        else if (decode.equalsIgnoreCase(".."))
            decode = "и";
        else if (decode.equalsIgnoreCase(".---"))
            decode = "й";
        else if (decode.equalsIgnoreCase("-.-"))
            decode = "к";
        else if (decode.equalsIgnoreCase(".-.."))
            decode = "л";
        else if (decode.equalsIgnoreCase("--"))
            decode = "м";
        else if (decode.equalsIgnoreCase("-."))
            decode = "н";
        else if (decode.equalsIgnoreCase("---"))
            decode = "о";
        else if (decode.equalsIgnoreCase(".--."))
            decode = "п";
        else if (decode.equalsIgnoreCase("--.-"))
            decode = "щ";
        else if (decode.equalsIgnoreCase(".-."))
            decode = "р";
        else if (decode.equalsIgnoreCase("..."))
            decode = "с";
        else if (decode.equalsIgnoreCase("-"))
            decode = "т";
        else if (decode.equalsIgnoreCase("..-"))
            decode = "у";
        else if (decode.equalsIgnoreCase("...-"))
            decode = "ж";
        else if (decode.equalsIgnoreCase(".--"))
            decode = "в";
        else if (decode.equalsIgnoreCase("-..-"))
            decode = "ь";
        else if (decode.equalsIgnoreCase("-.--"))
            decode = "ы";
        else if (decode.equalsIgnoreCase("--.."))
            decode = "з";
        else if (decode.equalsIgnoreCase("---."))
            decode = "ч";
        else if (decode.equalsIgnoreCase("----"))
            decode = "ш";
        else if (decode.equalsIgnoreCase("..--"))
            decode = "ю";
        else if (decode.equalsIgnoreCase(".-.-"))
            decode = "я";
        else if (decode.equalsIgnoreCase("..-.."))
            decode = "э";
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
            decode = "№";
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
