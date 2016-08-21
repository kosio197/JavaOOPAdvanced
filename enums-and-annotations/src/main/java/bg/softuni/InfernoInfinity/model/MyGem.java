package bg.softuni.InfernoInfinity.model;

public class MyGem {

    public static enum Gem {

        RUBY(7, 2, 5, 16, 29), EMERALD(1, 4, 9, 6, 19), AMETHYST(2, 8, 4, 12, 38);

        private int strength;
        private int agility;
        private int vitality;
        private int bonusMinDamage;
        private int bonusMaxdamage;

        private Gem(int strength, int agility, int vitality, int bonusMinDamage, int bonusMaxdamage) {
            this.strength = strength;
            this.agility = agility;
            this.vitality = vitality;
            this.bonusMinDamage = bonusMinDamage;
            this.bonusMaxdamage = bonusMaxdamage;
        }

        public int getStrength() {
            return strength;
        }

        public int getAgility() {
            return agility;
        }

        public int getVitality() {
            return vitality;
        }

        public int getBonusMinDamage() {
            return bonusMinDamage;
        }

        public int getBonusMaxdamage() {
            return bonusMaxdamage;
        }
    }
}
