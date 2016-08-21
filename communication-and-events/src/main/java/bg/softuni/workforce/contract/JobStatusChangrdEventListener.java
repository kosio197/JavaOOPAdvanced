package bg.softuni.workforce.contract;

import bg.softuni.workforce.event.JobStatusChangedEvent;

public interface JobStatusChangrdEventListener {

    void onJobStatusChangrdEvent(JobStatusChangedEvent event);
}
