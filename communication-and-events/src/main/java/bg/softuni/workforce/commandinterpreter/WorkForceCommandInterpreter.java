package bg.softuni.workforce.commandinterpreter;

import java.util.HashMap;
import java.util.Map;

import bg.softuni.workforce.model.Job;
import bg.softuni.workforce.model.JobsList;
import bg.softuni.workforce.model.PartTimeEmployee;
import bg.softuni.workforce.model.StandartEmployee;
import bg.softuni.workforce.model.WorkForceEmployee;

public class WorkForceCommandInterpreter {

    private JobsList jobs;
    private Map<String, WorkForceEmployee> temp;

    public WorkForceCommandInterpreter() {
        this.jobs = new JobsList();
        this.temp = new HashMap<>();
    }

    public String executeCommand(String command) {
        String commandInfo[] = command.split("\\s+");

        switch (commandInfo[0]) {
            case "StandartEmployee":
                temp.put(commandInfo[1], new StandartEmployee(commandInfo[1], 0));
                break;

            case "PartTimeEmployee":
                temp.put(commandInfo[1], new PartTimeEmployee(commandInfo[1], 0));
                break;

            case "Job":
                WorkForceEmployee check = temp.get(commandInfo[3]);
                if (check == null) {
                    throw new IllegalArgumentException();
                }

                Job next = new Job(temp.get(commandInfo[3]), commandInfo[1], Integer.parseInt(commandInfo[2]));
                jobs.add(next);
                next.registerListener(jobs);

                break;

            case "Pass":
                StringBuilder pass = new StringBuilder();
                for (int i = jobs.size() - 1; i >= 0; i--) {
                    String temp = jobs.get(i).updateJob();
                    if (temp != null && !temp.trim().equals("")) {
                        pass.append(temp + "\n");
                    }
                }

                return pass.toString() == "" ? null : pass.toString();

            case "Status":
                StringBuilder stat = new StringBuilder();
                for (Job job : jobs) {
                    String temp = job.getStatus();
                    if (temp != null && !temp.trim().equals("")) {
                        stat.append(temp + "\n");
                    }
                }

                return stat.toString() == "" ? null : stat.toString();

            default:
                break;
        }

        return null;
    }
}
