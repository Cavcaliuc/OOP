package lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/lab4/one_expression.txt")));

        System.out.println(content);

        char[] chars = content.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') counter++;
            if (chars[i] == ')') counter--;
        }
        if (counter == 0)

            System.out.println("Expresion is corect");
        else if (counter < 0) {
            System.out.println("That expresion is not correct");
            System.out.println("prea multe parantenze inchise nr.=" + abs(counter));}
            else{
                System.out.println("That expresion is not correct");
                System.out.println("prea multe parantenze deschise nr.=" + counter);
            }

        }
    }





