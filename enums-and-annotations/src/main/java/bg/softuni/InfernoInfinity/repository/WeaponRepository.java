package bg.softuni.InfernoInfinity.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import bg.softuni.InfernoInfinity.contract.Weapon;

public class WeaponRepository implements Iterator<Weapon>, Iterable<Weapon> {

    private HashMap<String, Weapon> map;
    private List<Weapon> list;

    public WeaponRepository() {
        this.map = new LinkedHashMap<>();
        this.list = new ArrayList<>();
    }

    public void addWeapon(Weapon weapon) {
        map.put(weapon.getName(), weapon);
        list.add(weapon);
    }

    public Weapon getWeapon(String name) {
        return map.get(name);
    }

    public void removeWeapon(Weapon weapon) {
        map.remove(weapon.getName());
        list.remove(weapon);
    }

    public void removeWeapon(String name) {
        Weapon w = map.remove(name);
        if (w != null)
            list.remove(w);
    }

    private static int index = 0;
    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Weapon next() {
        return list.get(index++);
    }

    @Override
    public Iterator<Weapon> iterator() {
        return iterator();
    }

}
