package Lab7;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class TextParser {
    private String text;

    public TextParser(String text) {
        this.text =text;
    }

    public int getNrOfSentences() {
        char[] chars = text.toCharArray();
        int nrOfSentences = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') nrOfSentences++;
            if (chars[i] == '!') nrOfSentences++;
            if (chars[i] == '?') nrOfSentences++;
        }

        return nrOfSentences;
    }

    public int getNrOfWords () {
        char[] chars = text.toCharArray();
        int nrOfWords = 0;
        for (int i = 0; i< chars.length; i++){
            if (chars[i] == ' ') nrOfWords++;
        }
        return nrOfWords;
    }

    public int getNrOfLetters (){
        char[] chars = text.toCharArray();
        int nrOfLetters = 0;
        for (int i = 0; i < chars.length; i++){
            if (Character.isLetter(chars[i])) nrOfLetters++;
        // hars[i] == 'a')||(chars[i] == 'b')||(chars[i] == 'c')||(chars[i] == 'd')||(chars[i] == 'e')
        }
        return nrOfLetters;
    //String str = "abc";  // or anything else
    }


    public String[] getTop5Words() {
        List<String> list      = new ArrayList<>();
//        list.add("element 1");
//        list.add("element 2");
//        list.add("element 3");
//        list.add("element 3");
//
//        String[] objects1 = list.toArray(new String[0]);
//        for (i = 0; i<list;i++){

 //       }

        return new String[10];

    }
}
