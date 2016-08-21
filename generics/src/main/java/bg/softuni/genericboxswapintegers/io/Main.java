package bg.softuni.genericboxswapintegers.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.genericbox.impl.GenericBoximpl;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        GenericBoximpl<Integer> box = new GenericBoximpl<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputCount; i++) {
            int data = Integer.parseInt(br.readLine());
            box.addGenericType(data);
        }

        String swapCommand[] = br.readLine().split("\\s+");
        int first = Integer.valueOf(swapCommand[0]);
        int last = Integer.valueOf(swapCommand[1]);
        try {

            box.swapElements(first, last);
        } catch (Exception e) {
        }

        System.out.println(box.toString());
    }
}
