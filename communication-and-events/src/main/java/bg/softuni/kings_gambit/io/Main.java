package bg.softuni.kings_gambit.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.kings_gambit.model.GambitPalace;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        GambitPalace palace = new GambitPalace();

        palace.addKing(br.readLine());
        palace.addRoyalGuards(br.readLine());
        palace.addFootmans(br.readLine());

        String command = br.readLine();

        while (!command.equals("End")) {
            String result = palace.executeCommand(command);

            if (result != null) {
                System.out.println(result);
            }
            command = br.readLine();
        }
        br.close();
    }
}
