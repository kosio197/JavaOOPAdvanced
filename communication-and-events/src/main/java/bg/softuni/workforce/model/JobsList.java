package bg.softuni.workforce.model;

import java.util.ArrayList;
import java.util.Iterator;

import bg.softuni.workforce.contract.JobStatusChangrdEventListener;
import bg.softuni.workforce.event.JobStatusChangedEvent;

public class JobsList extends ArrayList<Job> implements JobStatusChangrdEventListener {
    private static final long serialVersionUID = 1L;

    @Override
    public void onJobStatusChangrdEvent(JobStatusChangedEvent event) {
        Iterator<Job> iterator = this.iterator();
        while (iterator.hasNext()) {
            Job job = iterator.next();
            if (job.equals(event.getSource())) {
                iterator.remove();
            }
        }
    }
}
