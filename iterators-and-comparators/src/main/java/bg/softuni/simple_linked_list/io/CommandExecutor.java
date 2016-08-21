package bg.softuni.simple_linked_list.io;

import bg.softuni.simple_linked_list.model.LinkedListImpl;

public class CommandExecutor {

    LinkedListImpl<Integer> myList = new LinkedListImpl<>();

    public String execut(String command, int value) {
        switch (command) {
            case "Add":
                myList.addElement(value);
                break;
            case "Remove":
                myList.removeElement(value);
                break;
            case "getSize":
                return String.valueOf(myList.getSize());
            case "getAllElements":
                return stringValueOfElement(myList);
            default:
                throw new IllegalArgumentException("Unsupported Command: " + command);
        }
        return null;
    }

    private String stringValueOfElement(LinkedListImpl<Integer> myList) {
        StringBuilder sb = new StringBuilder();

        for (Integer t : myList.getAllElement()) {
            sb.append(t + " ");
        }
        return sb.toString().trim();
    }

}
