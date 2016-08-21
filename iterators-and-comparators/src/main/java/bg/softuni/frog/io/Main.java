package bg.softuni.frog.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import bg.softuni.frog.model.Lake;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String info = br.readLine();

        List<Long> list = new ArrayList<>();

        while (!info.equalsIgnoreCase("END") && !info.equals("")) {

            String data[] = info.split(",");

            for (String str : data) {
                try {
                    list.add(Long.parseLong(str.trim()));
                } catch (Exception e) {
                    continue;
                }
            }

            info = br.readLine();
        }

        br.close();

        if (list.size() == 0) {
            return;
        }
        Lake lake = new Lake(list);
        List<Long> result = lake.getResult();

        for (int i = 0; i < result.size() - 1; i++) {
            System.out.print(result.get(i) + ", ");
        }
        System.out.print(result.get(result.size() - 1));
    }
}
