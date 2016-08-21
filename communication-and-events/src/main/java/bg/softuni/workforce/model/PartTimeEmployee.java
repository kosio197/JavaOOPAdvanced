package bg.softuni.workforce.model;

public class PartTimeEmployee extends WorkForceEmployee {

    private static final int WORKHOURS = 20;

    public PartTimeEmployee(String name, int workHoursPerWeek) {
        super(name, WORKHOURS);

    }

    @Override
    void passWeek() {
        setWorkHoursPerWeek(WORKHOURS);
    }

}
