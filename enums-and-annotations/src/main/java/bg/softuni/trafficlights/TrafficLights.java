package bg.softuni.trafficlights;

public class TrafficLights {

    public enum TrafficLight {
        RED(0), GREEN(1), YELLOW(2);
        private int value;

        private TrafficLight(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
