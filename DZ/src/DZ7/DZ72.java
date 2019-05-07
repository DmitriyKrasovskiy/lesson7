package DZ7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Подсчет количества слов
 */
public class DZ72 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s"); //паттерн пробела (можно заменить  ("[ ]")  )

        Scanner in = new Scanner(System.in);
        System.out.print("Input testText: ");
        String testText = in.nextLine();
        // ввод текста с консоли

        testText = testText.trim(); //убрали пробелы в начале и конце строки


        //String str = testText;
        //String[] words = str.split(" +");
        //for (String word : words) {
        //String finishText = (word + " ");


        String text = testText;
        String[] words = text.split("[ ]{2,}");
        String finishText = words[0];
        int i;
        for (i = 1; i < words.length - 1; ++i)
            finishText += words[i] + " ";
        if(i < words.length)
            finishText += words[i];


        System.out.println("Ваш текст до:" + testText);
        System.out.println("Ваш текст после:" + finishText);
        Matcher matcher = pattern.matcher(finishText);

        int lenghText = testText.length();
        System.out.println("Длина исходного текста=" + " " + lenghText);


        int count = 0;
        // int i = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("Слов в тексте:" + " " + (count + 1));
        //подсчет слов в строке
    }
}

