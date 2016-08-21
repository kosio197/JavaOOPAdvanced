package bg.softuni.militaryelite.factory;

import bg.softuni.militaryelite.model.RepairImpl;
import bg.softuni.militaryelite.model.contracts.Repair;

public class RepairFactory {
    public static Repair createRepair(String parts, int hoursWorked){
        return new RepairImpl(parts, hoursWorked);
    }
}
