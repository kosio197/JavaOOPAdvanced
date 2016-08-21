package bg.softuni.birthdaycelebration.model.citizen;

import bg.softuni.birthdaycelebration.model.citizen.contracts.Pet;

public class PetImpl extends CitizenImpl implements Pet {
    private String birthday;

    public PetImpl(String name, String birthday) {
        super("pet", name);

        if (birthday == null || birthday.trim().equals("")) {
            throw new IllegalArgumentException("Birthday can't be empty");
        }

        this.birthday = birthday;
    }

    @Override
    public String getBirthday() {
        return birthday;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(this);
    }
}