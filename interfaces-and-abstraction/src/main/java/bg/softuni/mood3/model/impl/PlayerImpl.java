package bg.softuni.mood3.model.impl;

import bg.softuni.mood3.model.contracts.Player;

public class PlayerImpl implements Player {

    private final String ARCHANGELENERGY = "mana";
    private final String DEMONENERGY = "energy";

    private String username;
    private String type;
    private double specialPoints;
    private int level;

    private String hashedPassword;
    private String energy;


    public PlayerImpl(String username, String type, double specialPoints, int level) {
        super();
        this.username = username;
        this.level = level;
        this.specialPoints = specialPoints;
        this.type = type;
        setHashedPassword();
    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getSpecialPoints() {
        return specialPoints;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getHashedPassword() {
        return hashedPassword;
    }

    @Override
    public void setHashedPassword() {
        if (this.type.equals("Demon")) {
            this.hashedPassword = String.valueOf(this.username.length() * 217);

        } else if (this.type.equals("Archangel")) {
            StringBuilder sb = new StringBuilder();
            for (int i = username.length() - 1; i >= 0; i--) {
                sb.append(username.charAt(i));
            }
            sb.append(username.length() * 21);
            this.hashedPassword = sb.toString();
        } else {
            throw new IllegalArgumentException("Invalid type: " + type);
        }
    }


    public String getEnergy() {
        return energy;
    }

    @Override
    public void setEnergy() {
        if (this.type.equals("Demon")) {
            this.energy = DEMONENERGY;

        } else if (this.type.equals("Archangel")) {
            this.energy = ARCHANGELENERGY;

        } else {
            throw new IllegalArgumentException("Invalid type: " + type);
        }
    }



    @Override
    public String toString() {
        String point = String.valueOf(specialPoints * level);
        if (type.equals("Archangel")) {
            point = String.valueOf((int) (specialPoints * level));
        }
        return String.format("\"%s\" | \"%s\" -> %s\n%s",
                this.username, this.hashedPassword, this.type, point);
    }

}
