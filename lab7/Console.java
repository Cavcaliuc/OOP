package Lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Math.abs;

public class Console {
    public static void main(String[] args)  {



        String bigText = null;
        try {
           // bigText = bigText.toUpperCase();
            bigText = new String(Files.readAllBytes(Paths.get("src/lab7/information.txt")));
        } catch (IOException e) {
            System.out.println("no such file");
        }

        TextParser textParser = new TextParser(bigText);

        int nrOfSentences = textParser.getNrOfSentences();
        System.out.println("Number of sentences: " + nrOfSentences);

        int nrOfWords = textParser.getNrOfWords();
        System.out.println("Number of words: " + nrOfWords);

        int nrOfLetters = textParser.getNrOfLetters();
        System.out.println("Number of letters: " + nrOfLetters);

        String[] top5Words = textParser.getTop5Words();
        System.out.println("Top 5 words: " + top5Words);

        System.out.println( "\n Information : \n" + bigText);


    }
}
