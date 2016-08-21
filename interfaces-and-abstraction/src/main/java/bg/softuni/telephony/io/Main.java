package bg.softuni.telephony.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import bg.softuni.telephony.Smartphone;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> callData = Arrays.asList(br.readLine().split("\\s+"));
        List<String> browsData = Arrays.asList(br.readLine().split("\\s+"));

        br.close();

        Smartphone fone = new Smartphone();

        for (String calls : callData) {
            try {
                fone.addCall(" " + calls + " ");
                System.out.println("Calling... " + calls);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for (String addres : browsData) {
            try {
                fone.addAddres(" " + addres + " ");
                System.out.println("Browsing: " + addres + "!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
