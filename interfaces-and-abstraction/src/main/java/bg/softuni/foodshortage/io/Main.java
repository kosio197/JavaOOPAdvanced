package bg.softuni.foodshortage.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import bg.softuni.foodshortage.city.CitizenFactory;
import bg.softuni.foodshortage.model.citizen.contracts.Buyer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String info = br.readLine();

        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < Integer.valueOf(info); i++) {
            String data[] = br.readLine().split("\\s+");
            Buyer citizen;

            if (data.length == 4) {
                citizen = (Buyer) CitizenFactory.createPerson(data[2], data[0], Integer.valueOf(data[1]), data[1]);
            } else {
                citizen = (Buyer) CitizenFactory.createRebel(data[2], data[0], Integer.valueOf(data[1]));
            }

            buyers.put(data[0], citizen);
        }

        info = br.readLine();

        while (!info.equals("End")) {

            if (buyers.get(info) != null)
                buyers.get(info).buyFood();

            info = br.readLine();
        }

        br.close();

        int result = 0;

        for (Map.Entry<String, Buyer> next : buyers.entrySet()) {
            result += next.getValue().getFood();
        }

        System.out.println(result);
    }
}