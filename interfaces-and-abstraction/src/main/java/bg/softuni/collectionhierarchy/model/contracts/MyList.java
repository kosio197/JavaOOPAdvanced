package bg.softuni.collectionhierarchy.model.contracts;

import java.util.List;

public interface MyList {
    int addToTheStart(String str);

    String removeFirst();

    List<String> used();
}
