package bg.softuni.simple_linked_list.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        CommandExecutor commandExecutor = new CommandExecutor();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String input[] = br.readLine().split("\\s+");

            String command = input[0];
            int value = Integer.parseInt(input[1].trim());
            try {
                commandExecutor.execut(command, value);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        System.out.println(commandExecutor.execut("getSize", 0));
        System.out.println(commandExecutor.execut("getAllElements", 0));
    }
}
