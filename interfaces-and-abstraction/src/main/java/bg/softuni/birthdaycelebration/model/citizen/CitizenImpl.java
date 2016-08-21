package bg.softuni.birthdaycelebration.model.citizen;

import bg.softuni.birthdaycelebration.model.citizen.contracts.Citizen;

public abstract class CitizenImpl implements Citizen {

    private String id;
    private String name;

    public CitizenImpl(String id, String name) {
        if (id == null || id.trim().equals("")) {
            throw new IllegalArgumentException("Id can't be empty");
        }

        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException("Name can't be empty");
        }

        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Citizen)) {
            return false;
        }

        return ((Citizen)obj).getId().equals(id);
    }
}
