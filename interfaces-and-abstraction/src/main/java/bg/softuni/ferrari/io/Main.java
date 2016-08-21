package bg.softuni.ferrari.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.ferrari.Ferrari;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Ferrari ferrari = new Ferrari(br.readLine(), Ferrari.MODEL_488_SPIDER);
        br.close();

        System.out.println(ferrari);
    }

}
