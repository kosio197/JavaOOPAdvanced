package bg.softuni.workforce.model;

public class StandartEmployee extends WorkForceEmployee {

    private static final int WORKHOURS = 40;

    public StandartEmployee(String name, int workHoursPerWeek) {
        super(name, WORKHOURS);

    }

    @Override
    void passWeek() {
        setWorkHoursPerWeek(WORKHOURS);
    }
}
