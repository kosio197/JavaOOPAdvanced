package bg.softuni.trafficlights.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import bg.softuni.trafficlights.TrafficLights.TrafficLight;

public class Main {

    private static List<TrafficLight> lights = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (TrafficLight light : TrafficLight.values()) {
            lights.add(light);
        }

        String inp[] = br.readLine().split("\\s+");
        TrafficLight crosRoads[] = new TrafficLight[inp.length];

        for (int i = 0; i < inp.length; i++) {
            crosRoads[i] = TrafficLight.valueOf(inp[i]);
        }

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < inp.length - 1; j++) {
                TrafficLight next = getNextLight(crosRoads[j]);
                crosRoads[j] = next;
                System.out.print(next + " ");
            }
            TrafficLight next = getNextLight(crosRoads[inp.length - 1]);
            crosRoads[inp.length - 1] = next;
            System.out.print(next + " \n");
        }
    }

    private static TrafficLight getNextLight(TrafficLight crosroad) {

        if (crosroad.getValue() < lights.size() - 1) {
            return lights.get(crosroad.getValue() + 1);
        } else {
            return lights.get(0);
        }
    }
}
