package morse;

public class MorseCode {
    public static String stringToMorse(String text) {
        String newText = "";
        String selectedChar;
        String convertedChar;

        for (int i = 0; i < text.length(); i++) {
            selectedChar = text.charAt(i) + "";
            convertedChar = encode(selectedChar);

            if (convertedChar.equals(" ") || convertedChar.equals("\n")){
                newText = newText + "| ";
            } else {
                newText = newText + convertedChar;
                if (!convertedChar.equals(" ")) {
                    newText = newText + " ";
                }
            }
        }
        return newText;
    }

    public static String encode (String encode) {
        if (encode.equalsIgnoreCase("a") || encode.equalsIgnoreCase("а"))
            encode = ".-";
        else if (encode.equalsIgnoreCase("b") || encode.equalsIgnoreCase("б"))
            encode = "-...";
        else if (encode.equalsIgnoreCase("c") || encode.equalsIgnoreCase("ц"))
            encode = "-.-.";
        else if (encode.equalsIgnoreCase("d") || encode.equalsIgnoreCase("д"))
            encode = "-..";
        else if (encode.equalsIgnoreCase("e") || encode.equalsIgnoreCase("е"))
            encode = ".";
        else if (encode.equalsIgnoreCase("f") || encode.equalsIgnoreCase("ф"))
            encode = "..-.";
        else if (encode.equalsIgnoreCase("g") || encode.equalsIgnoreCase("г"))
            encode = "--.";
        else if (encode.equalsIgnoreCase("h") || encode.equalsIgnoreCase("х"))
            encode = "....";
        else if (encode.equalsIgnoreCase("i") || encode.equalsIgnoreCase("и"))
            encode = "..";
        else if (encode.equalsIgnoreCase("j") || encode.equalsIgnoreCase("й"))
            encode = ".---";
        else if (encode.equalsIgnoreCase("k") || encode.equalsIgnoreCase("к"))
            encode = "-.-";
        else if (encode.equalsIgnoreCase("l") || encode.equalsIgnoreCase("л"))
            encode = ".-..";
        else if (encode.equalsIgnoreCase("m") || encode.equalsIgnoreCase("м"))
            encode = "--";
        else if (encode.equalsIgnoreCase("n") || encode.equalsIgnoreCase("н"))
            encode = "-.";
        else if (encode.equalsIgnoreCase("o") || encode.equalsIgnoreCase("о"))
            encode = "---";
        else if (encode.equalsIgnoreCase("p") || encode.equalsIgnoreCase("п"))
            encode = ".--.";
        else if (encode.equalsIgnoreCase("q") || encode.equalsIgnoreCase("щ"))
            encode = "--.-";
        else if (encode.equalsIgnoreCase("r") || encode.equalsIgnoreCase("р"))
            encode = ".-.";
        else if (encode.equalsIgnoreCase("s") || encode.equalsIgnoreCase("с"))
            encode = "...";
        else if (encode.equalsIgnoreCase("t") || encode.equalsIgnoreCase("т"))
            encode = "-";
        else if (encode.equalsIgnoreCase("u") || encode.equalsIgnoreCase("у"))
            encode = "..-";
        else if (encode.equalsIgnoreCase("v") || encode.equalsIgnoreCase("ж"))
            encode = "...-";
        else if (encode.equalsIgnoreCase("w") || encode.equalsIgnoreCase("в"))
            encode = ".--";
        else if (encode.equalsIgnoreCase("x") || encode.equalsIgnoreCase("ь") || encode.equalsIgnoreCase("ъ"))
            encode = "-..-";
        else if (encode.equalsIgnoreCase("y") || encode.equalsIgnoreCase("ы"))
            encode = "-.--";
        else if (encode.equalsIgnoreCase("z") || encode.equalsIgnoreCase("з"))
            encode = "--..";
        else if (encode.equalsIgnoreCase("ч"))
            encode = "---.";
        else if (encode.equalsIgnoreCase("ш"))
            encode = "----";
        else if (encode.equalsIgnoreCase("ю"))
            encode = "..--";
        else if (encode.equalsIgnoreCase("я"))
            encode = ".-.-";
        else if (encode.equalsIgnoreCase("э"))
            encode = "..-..";
        else if (encode.equalsIgnoreCase("0"))
            encode = "-----";
        else if (encode.equalsIgnoreCase("1"))
            encode = ".----";
        else if (encode.equalsIgnoreCase("2"))
            encode = "..---";
        else if (encode.equalsIgnoreCase("3"))
            encode = "...--";
        else if (encode.equalsIgnoreCase("4"))
            encode = "....-";
        else if (encode.equalsIgnoreCase("5"))
            encode = ".....";
        else if (encode.equalsIgnoreCase("6"))
            encode = "-....";
        else if (encode.equalsIgnoreCase("7"))
            encode = "--...";
        else if (encode.equalsIgnoreCase("8"))
            encode = "---..";
        else if (encode.equalsIgnoreCase("9"))
            encode = "----.";
        else if (encode.equalsIgnoreCase("."))
            encode = "......";
        else if (encode.equalsIgnoreCase(","))
            encode = ".-.-.-";
        else if (encode.equalsIgnoreCase("?"))
            encode = "..--..";
        else if (encode.equalsIgnoreCase(";"))
            encode = "-.-.-";
        else if (encode.equalsIgnoreCase(":"))
            encode = "---...";
        else if (encode.equalsIgnoreCase("№")  || encode.equalsIgnoreCase("#"))
            encode = "-..-.";
        else if (encode.equalsIgnoreCase("\""))
            encode = ".-..-.";
        else if (encode.equalsIgnoreCase("\'"))
            encode = ".----.";
        else if (encode.equalsIgnoreCase("(")  || encode.equalsIgnoreCase(")"))
            encode = "-.--.-";
        else if (encode.equalsIgnoreCase("!"))
            encode = "--..--";
        else if (encode.equalsIgnoreCase("/"))
            encode = "-..-.";
        else if (encode.equalsIgnoreCase("-"))
            encode = "-....-";

        return encode;
    }
}
