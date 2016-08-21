package bg.softuni.collectionhierarchy.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.collectionhierarchy.model.contracts.AddCollection;
import bg.softuni.collectionhierarchy.model.contracts.AddRemoveCollection;
import bg.softuni.collectionhierarchy.model.contracts.MyList;
import bg.softuni.collectionhierarchy.model.impl.AddCollectionImpl;
import bg.softuni.collectionhierarchy.model.impl.AddRemoveCollectionImpl;
import bg.softuni.collectionhierarchy.model.impl.MyListImpl;

public class Main {
    public static void main(String[] args) throws IOException {
        AddCollection addC = new AddCollectionImpl();
        AddRemoveCollection addRC = new AddRemoveCollectionImpl();
        MyList mL = new MyListImpl();

        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        StringBuilder result3 = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String data[] = br.readLine().split("\\s+");

        for (String str : data) {
            int a =  addC.addToTheEnd(str);
            result1.append(a + " ");

            int b = addRC.addToTheStart(str);
            result2.append(b + " ");

            int c = mL.addToTheStart(str);
            result3.append(c + " ");
        }

        System.out.printf("%s\n%s\n%s\n", result1.toString().trim(),
                result2.toString().trim(),
                result3.toString().trim());

        int numberForRemove = Integer.valueOf(br.readLine());
        br.close();

        result2.delete(0, result2.length() - 1);
        result3.delete(0, result3.length() - 1);

        for (int i = 0; i < numberForRemove; i++) {
            result2.append(addRC.removeLast() + " ");
            result3.append(mL.removeFirst() + " ");
        }

        System.out.printf("%s\n%s", result2.toString().trim(), result3.toString().trim());
    }
}
