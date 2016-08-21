package bg.softuni.collectionhierarchy.model.impl;

import java.util.Collections;
import java.util.List;

import bg.softuni.collectionhierarchy.model.contracts.MyList;

public class MyListImpl extends AbstractCollections implements MyList {

    @Override
    public int addToTheStart(String str) {
        super.temp.add(0, str);
        return 0;
    }

    @Override
    public String removeFirst() {
        return super.temp.remove(0);
    }

    @Override
    public List<String> used() {
        return Collections.unmodifiableList(super.temp);
    }

}
