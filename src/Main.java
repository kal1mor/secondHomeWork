import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        String line = null;
        String minLine = null;
        int max = 0;
        int min = 0;
        int middle = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.print("Incorrect data entered!");
            return;
        }

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter line number " + (i+1) + ": ");
            strings[i] = scanner.next();
        }

// определение длинной и короткой строки

        for (int i = 0; i < strings.length; i++){
            if (strings[i].length() > max) {
                max = strings[i].length();
                line = strings[i];
            }
        }
        System.out.println("Length: " + max + " longest string: " + line);

        for (int i = 0; i < strings.length; i++){
            int b = 1;
            if (strings[i].length() < strings[b].length()) {
                min = strings[i].length();
                minLine = strings[i];
            }
            b++;
        }
        System.out.println("Length: " + min + " smaller string: " + minLine);

// нахождение средней длины строк


        for (int i = 0; i < strings.length; i++){
            middle += strings[i].length();
        }
        middle = middle/n;
        System.out.println("\nAverage line length " + middle);

// вывод на экран трех строк в разном формате

        int numberLines = 3;

        String[] threeStrings = new String[numberLines];

        for (int i = 0; i < numberLines; i++) {
            System.out.print("Enter line number " + (i+1) + ": ");
            threeStrings[i] = scanner.next();
        }


// вывод строки в обратном порядке
        String str = "";
        for (int i = threeStrings[0].length() - 1; i >= 0; i--){
            str += threeStrings[0].charAt(i);
        }


        System.out.println("first line " + str);
        System.out.println("second line " + threeStrings[1].toLowerCase()); // Вывод строки в нижнем регистре
        System.out.println("third line " + threeStrings[2]); //Обычный вывод строки
    }
}