import java.io.*;
import java.util.ArrayList;

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

        FileWriter writer = new FileWriter("my-output.txt");
        writer.write(sequences.toString());
        writer.close();

    }
}