package bg.softuni.militaryelite.model;

import bg.softuni.militaryelite.model.contracts.Repair;

public class RepairImpl implements Repair {

    private String parts;
    private int hoursWorked;

    public RepairImpl(String parts, int hoursWorked) {
        super();
        this.parts = parts;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getParts() {
        return parts;
    }

    @Override
    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", getParts(), getHoursWorked());
    }
}
