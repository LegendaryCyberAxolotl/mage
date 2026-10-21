public class Poison implements Spells {
        private int damage;
        private int range;
        private int radius;
        private int manaCost;

        public Poison() {
            this.damage = 35;
            this.range = 50;
            this.radius = 1;
            this.manaCost = 5;
        }

        public void castSpell() {
            System.out.println("Poison! Dealt " + this.damage + " damage. Cost: " + this.manaCost);
        }

        public int getManaCost() {
            return this.manaCost;
        }
}
