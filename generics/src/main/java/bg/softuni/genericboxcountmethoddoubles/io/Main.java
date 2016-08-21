package bg.softuni.genericboxcountmethoddoubles.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.genericbox.impl.GenericBoximpl;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        GenericBoximpl<Double> box = new GenericBoximpl<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < inputCount; i++) {

            double data = Double.parseDouble(br.readLine());

            box.addGenericType(data);
        }

        double compareElement = Double.parseDouble(br.readLine());

        System.out.println(box.getCountOfGreaterElement(box.getCollection(), compareElement));
    }
}
