package bg.softuni.mood3.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.mood3.model.contracts.Player;
import bg.softuni.mood3.model.impl.PlayerImpl;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String playerInfo[] = br.readLine().split("\\|");
        br.close();

        for (int i = 0; i < playerInfo.length; i += 4) {
            Player player = new PlayerImpl(playerInfo[i].trim(), playerInfo[i + 1].trim(),
                    Double.valueOf(playerInfo[i + 2].trim()), Integer.valueOf(playerInfo[i + 3].trim()));

            System.out.println(player.toString());
        }

    }
}
