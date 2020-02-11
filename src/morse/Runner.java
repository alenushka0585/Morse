package morse;

import morse.Converter;

import java.io.*;

public class Runner {
    public static void main(String[] args) {

        try (BufferedReader readerForCopyRus = new BufferedReader(new FileReader("SourceRus"));
             BufferedWriter writerForCopyRus = new BufferedWriter(new FileWriter("CopyRus.txt"));
             BufferedReader readerForCopyEng = new BufferedReader(new FileReader("SourceEng"));
             BufferedWriter writerForCopyEng = new BufferedWriter(new FileWriter("CopyEng.txt"));
             BufferedReader readerRus = new BufferedReader(new FileReader("SourceRus"));
             BufferedReader readerEng = new BufferedReader(new FileReader("SourceEng"));
             BufferedWriter writerMorseRus = new BufferedWriter(new FileWriter("MorseRus.txt"));
             BufferedReader readerMorseRus = new BufferedReader(new FileReader("MorseSourceRus"));
             BufferedWriter writerMorseEng = new BufferedWriter(new FileWriter("MorseEng.txt"));
             BufferedReader readerMorseEng = new BufferedReader(new FileReader("MorseSourceEng"));
             BufferedWriter writerRussianFromMorse = new BufferedWriter(new FileWriter("ResultRussianFromMorse.txt"));
             BufferedWriter writerEnglishFromMorse = new BufferedWriter(new FileWriter("ResultEnglishFromMorse.txt"));) {

            Converter.copy(readerForCopyRus,writerForCopyRus);
            Converter.copy(readerForCopyEng,writerForCopyEng);

            Converter.convertToMorse(readerRus, writerMorseRus);
            Converter.convertFromMorseToRussian(readerMorseRus,writerRussianFromMorse);

            Converter.convertToMorse(readerEng, writerMorseEng);
            Converter.convertFromMorseToEnglish(readerMorseEng,writerEnglishFromMorse);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
