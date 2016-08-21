package bg.softuni.collectionhierarchy.model.impl;

import bg.softuni.collectionhierarchy.model.contracts.AddRemoveCollection;

public class AddRemoveCollectionImpl extends AbstractCollections implements AddRemoveCollection {

    @Override
    public int addToTheStart(String str) {
        super.temp.add(0, str);
        return 0;
    }

    @Override
    public String removeLast() {
        return super.temp.remove(super.temp.size() - 1);
    }
}
