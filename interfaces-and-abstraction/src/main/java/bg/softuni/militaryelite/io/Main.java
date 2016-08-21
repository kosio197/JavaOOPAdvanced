package bg.softuni.militaryelite.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import bg.softuni.militaryelite.factory.MissionFactory;
import bg.softuni.militaryelite.factory.RepairFactory;
import bg.softuni.militaryelite.factory.SoldierFactory;
import bg.softuni.militaryelite.model.contracts.Mission;
import bg.softuni.militaryelite.model.contracts.Mission.State;
import bg.softuni.militaryelite.model.contracts.Repair;
import bg.softuni.militaryelite.model.soldier.contracts.Commando;
import bg.softuni.militaryelite.model.soldier.contracts.Engineer;
import bg.softuni.militaryelite.model.soldier.contracts.LeutenantGeneral;
import bg.softuni.militaryelite.model.soldier.contracts.Private;
import bg.softuni.militaryelite.model.soldier.contracts.Spy;
import bg.softuni.militaryelite.model.soldier.contracts.SpecialisedSoldier.Corps;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String info = br.readLine();
        Map<String, Private> privatesMap = new HashMap<>();

        while (!info.equals("End")) {
            String data[] = info.split("\\s+");

            switch (data[0]) {

            case "Private": // Private <id> <firstName> <lastName> <salary>
                Private soldier = (Private) SoldierFactory.createPrivate(data[1], data[2], data[3], Double.valueOf(data[4]));
                privatesMap.put(data[1], soldier);
                System.out.println(soldier);
                break;
            case "LeutenantGeneral":// LeutenantGeneral <id> <firstName> <lastName> <salary> <private1Id>
                LeutenantGeneral leutenantGeneral = (LeutenantGeneral) SoldierFactory.createLeutenantGeneral(data[1], data[2], data[3], Double.valueOf(data[4]));

                for (int i = 5; i < data.length; i++) {
                    Private pr = privatesMap.get(data[i]);

                    if (pr != null) {
                        leutenantGeneral.addPrivates(pr);
                    }
                }

                System.out.println(leutenantGeneral.toString());
                System.out.println("Privates:");

                for (Private lgPrivate : leutenantGeneral.getPrivates()) {
                    System.out.println("  " + lgPrivate);
                }

                break;

            case "Engineer":
                try {
                    Engineer enginer = (Engineer) SoldierFactory.createEngineer(data[1], data[2], data[3], Double.valueOf(data[4]), Corps.valueOf(data[5]));

                    for (int i = 6; i < data.length; i += 2) {
                        Repair repair = RepairFactory.createRepair(data[i], Integer.valueOf(data[i + 1]));
                        enginer.addRepairs(repair);
                    }

                    System.out.println(enginer.toString());
                    System.out.println("Corps: " + enginer.getCorps());

                    System.out.println("Repairs:");

                    for (Repair repair : enginer.getRepairs()) {
                        System.out.println("  " + repair.toString());
                    }
                } catch (IllegalArgumentException e) {

                }

                break;
            case "Commando":
                try {
                    Commando commando = (Commando) SoldierFactory.createCommando(data[1], data[2], data[3], Double.valueOf(data[4]), Corps.valueOf(data[5]));

                    for (int i = 6; i < data.length; i += 2) {
                        Mission mission = null;

                        try {
                            mission = MissionFactory.createMission(data[i], State.valueOf(data[i + 1]));
                        } catch (IllegalArgumentException e) {
                            mission = null;
                            continue;
                        }
                        if (mission != null) {
                            commando.addMisions(mission);
                        }
                    }

                    System.out.println(commando.toString());
                    System.out.println("Corps: " + commando.getCorps());

                    System.out.println("Missions:");

                    for (Mission mission : commando.getMisions()) {
                        System.out.println("  " + mission);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input!");
                }

                break;
            case "Spy":
                Spy spy = (Spy) SoldierFactory.createSpy(data[1], data[2], data[3], Long.valueOf(data[4]));
                System.out.println(spy.toString());
                break;

            default:
                throw new IllegalArgumentException("Invalid Input" + info);

            }

            info = br.readLine();
        }

        br.close();
    }
}

