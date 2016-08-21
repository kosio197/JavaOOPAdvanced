package bg.softuni.workforce.model;

import java.util.ArrayList;
import java.util.List;

import bg.softuni.workforce.contract.JobStatusChangrdEventListener;
import bg.softuni.workforce.event.JobStatusChangedEvent;

public class Job {

    private WorkForceEmployee employee;
    private String jobName;
    private int hoursRequired;
    private List<JobStatusChangrdEventListener> listeners;

    public Job(WorkForceEmployee employee, String jobName, int hoursRequired) {
        listeners = new ArrayList<>();
        setEmployee(employee);
        setJobName(jobName);
        setHoursRequired(hoursRequired);
    }

    public void registerListener(JobStatusChangrdEventListener listener) {
        listeners.add(listener);
    }

    public void publishEvent(JobStatusChangedEvent event) {
        for (JobStatusChangrdEventListener listener : listeners) {
            listener.onJobStatusChangrdEvent(event);
        }
    }

    public String updateJob() {


        if (employee.getWorkHoursPerWeek() >= hoursRequired) {
            employee.setWorkHoursPerWeek(employee.getWorkHoursPerWeek() - hoursRequired);

            publishEvent(new JobStatusChangedEvent(this));

            return String.format("Job %s done!", getJobName());
        } else {
            setHoursRequired(this.hoursRequired - employee.getWorkHoursPerWeek());
            employee.setWorkHoursPerWeek(0);
        }

        this.employee.passWeek();
        return null;
    }

    public String getStatus() {
        return String.format("Job: %s Hours Remaining: %d", this.jobName, this.hoursRequired);
    }

    public WorkForceEmployee getEmployee() {
        return employee;
    }

    public String getJobName() {
        return jobName;
    }

    public int getHoursRequired() {
        return hoursRequired;
    }

    private void setEmployee(WorkForceEmployee employee) {
        this.employee = employee;
    }

    private void setJobName(String jobName) {
        this.jobName = jobName;
    }

    private void setHoursRequired(int hoursRequired) {
        this.hoursRequired = hoursRequired;
    }

}
