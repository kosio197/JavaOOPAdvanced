package bg.softuni.telephony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bg.softuni.telephony.model.Browsable;
import bg.softuni.telephony.model.Callable;

public class Smartphone implements Callable, Browsable {


    private List<String> allCalls;
    private List<String> allAddres;

    public Smartphone() {
        this.allCalls = new ArrayList<>();
        this.allAddres = new ArrayList<>();
    }

    @Override
    public void addAddres(String addres) {
        if (addres.split("[0-9]").length > 1) {
            throw new IllegalArgumentException("Invalid URL!");
        }

        allAddres.add(addres.trim());
    }

    @Override
    public void addCall(String call) {
        if (call.split("[a-zA-Z]").length > 1) {
            throw new IllegalArgumentException("Invalid number!");
        }

        allCalls.add(call.trim());
    }

    public List<String> getAllAddress() {
        return Collections.unmodifiableList(allAddres);
    }

    public List<String> getAllCalls() {
        return Collections.unmodifiableList(allCalls);
    }
}
