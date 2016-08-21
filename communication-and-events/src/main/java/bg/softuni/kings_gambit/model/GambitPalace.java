package bg.softuni.kings_gambit.model;

import java.util.Iterator;

import bg.softuni.kings_gambit.event.GambitAttackEvent;
import bg.softuni.kings_gambit.event.GambitPersonDeathEvent;
import bg.softuni.kings_gambit.repository.FootmanRepository;
import bg.softuni.kings_gambit.repository.RoyalGuardRepository;

public class GambitPalace {

    private King king;
    private RoyalGuardRepository royalGuards;
    private FootmanRepository footmans;

    public GambitPalace() {
        royalGuards = new RoyalGuardRepository();
        footmans = new FootmanRepository();
    }

    public void addKing(String kingName) {
        this.king = new King(kingName);
    }

    public void addRoyalGuards(String royalGuardsNames) {
        this.royalGuards = new RoyalGuardRepository();
        for (String name : royalGuardsNames.split("\\s+")) {
            RoyalGuard royalGuard = new RoyalGuard(name);
            royalGuards.addElement(royalGuard);
        }
    }

    public void addFootmans(String footmanNames) {
        this.footmans = new FootmanRepository();
        for (String name : footmanNames.split("\\s+")) {
            Footman footman = new Footman(name);
            footmans.addElement(footman);
        }
    }

    public String executeCommand(String command) {
        String commandInfo[] = command.split("\\s+");
        switch (commandInfo[0]) {
            case "Kill":
                killGambitPerson(commandInfo[1]);
                break;
            case "Attack":
                return attackPalace();
            default:
                break;
        }
        return null;
    }

    private String attackPalace() {
        StringBuilder sb = new StringBuilder();
        GambitAttackEvent event = new GambitAttackEvent(this);

        sb.append(king.onGambitPersonEvent(event) + "\n");

        for (GambitPerson gambitPerson : royalGuards) {
            sb.append(gambitPerson.onGambitPersonEvent(event) + "\n");
        }

        for (GambitPerson gambitPerson : footmans) {
            sb.append(gambitPerson.onGambitPersonEvent(event) + "\n");
        }
        return sb.toString().trim();
    }

    private void killGambitPerson(String name) {

        Iterator<GambitPerson> iterator = royalGuards.iterator();
        while (iterator.hasNext()) {
            GambitPerson person = iterator.next();
            if (person != null && person.getName().equals(name)) {
                person.setDamagePoint(person.getDamagePoint() - 1);
                if (person.getDamagePoint() == 0) {
                    royalGuards.onGambitPersonDeath(new GambitPersonDeathEvent(person));
                    return;
                }
            }
        }

        iterator = footmans.iterator();
        while (iterator.hasNext()) {
            GambitPerson person = iterator.next();
            if (person != null && person.getName().equals(name)) {
                person.setDamagePoint(person.getDamagePoint() - 1);
                if (person.getDamagePoint() == 0) {
                    footmans.onGambitPersonDeath(new GambitPersonDeathEvent(person));
                    return;
                }
            }
        }
    }
}
