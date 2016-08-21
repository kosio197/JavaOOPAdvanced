package bg.softuni.workforce.model;

public abstract class WorkForceEmployee {

    private String name;
    private int workHoursPerWeek;

    public WorkForceEmployee(String name, int workHoursPerWeek) {
        setName(name);
        setWorkHoursPerWeek(workHoursPerWeek);
    }

    public String getName() {
        return name;
    }

    abstract void passWeek();

    public int getWorkHoursPerWeek() {
        return workHoursPerWeek;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected void setWorkHoursPerWeek(int workHoursPerWeek) {
        this.workHoursPerWeek = workHoursPerWeek;
    }

}
