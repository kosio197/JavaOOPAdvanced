package bg.softuni.collectionhierarchy.model.impl;

import bg.softuni.collectionhierarchy.model.contracts.AddCollection;

public class AddCollectionImpl extends AbstractCollections implements AddCollection {

    @Override
    public int addToTheEnd(String str) {
        super.temp.add(str);
        return super.temp.size() - 1;
    }
}
