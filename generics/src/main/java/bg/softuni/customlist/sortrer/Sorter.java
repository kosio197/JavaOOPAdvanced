package bg.softuni.customlist.sortrer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bg.softuni.customlist.model.contracts.CustomList;

public class Sorter {
    public static <T extends Comparable<T>> void sortList(CustomList<T> list) {

        List<T> temp = new ArrayList<>();

        T t = list.remove(0);
        while (t != null) {
            temp.add(t);
            t = list.remove(0);
        }

        Collections.sort(temp, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < temp.size(); i++) {
            list.add(temp.get(i));
        }
    }
}
