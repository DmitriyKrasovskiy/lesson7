package DZ7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Поиск знаков препинания
 */
public class DZ71 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[,.:;?!]"); //паттерн знаки препинания

        Scanner in = new Scanner(System.in);
        System.out.print("Input testText: ");
        String testText = in.nextLine();
        // ввод текста с консоли

        System.out.println("Ваш текст:" + " " + testText);
        Matcher matcher = pattern.matcher(testText);
        //поиск знаков препинания через регулярные выражения

        int lenghText = testText.length();
        System.out.println("Длина текста=" + " " + lenghText);



        //  publik char[]  testText.toCharArray(); (неудачный эксперимент)


        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Знаков препинания в тексте:" +" " + count);
        //подсчет знаков препинания
    }
}

