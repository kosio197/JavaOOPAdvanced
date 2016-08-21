package bg.softuni.workforce.event;

import java.util.EventObject;

import bg.softuni.workforce.model.Job;

public class JobStatusChangedEvent extends EventObject {
    private static final long serialVersionUID = 1L;

    public JobStatusChangedEvent(Job source) {
        super(source);
    }
}
