import java.io.*;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("input.txt"));
        String input = scanner.nextLine();
        scanner.close();

        List<String> sequences = new ArrayList<>();
        Matcher m = Pattern.compile("\\d+|\\D+").matcher(input);
        while (m.find()) {
            sequences.add(m.group());
        }
        System.out.println(sequences);

        for (int i = 0; i < sequences.size(); i++) {
            char[] chars = sequences.get(i).toCharArray();
            if (Character.isDigit(chars[0])) {
                Arrays.sort(chars);// Or i can use any customized sort algo like single-pivot-quick , merge , bubble sort but this function uses Dual-Pivot Quicksort
            } else {
                Arrays.sort(chars);
            }
            sequences.set(i, new String(chars));
        }

        FileWriter writer = new FileWriter("my-output.txt");
        writer.write(sequences.toString());
        writer.close();

    }
}