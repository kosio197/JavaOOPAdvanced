package bg.softuni.militaryelite.model.soldier.contracts;

import java.util.List;

public interface LeutenantGeneral {
    List<Private> getPrivates();
    void addPrivates(Private privateSoldier);
}
