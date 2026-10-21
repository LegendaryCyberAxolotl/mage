public class Fireball implements Spells {
        private int damage;
        private int range;
        private int radius;
        private int manaCost;

        public Fireball() {
            this.damage = 100;
            this.range = 30;
            this.radius = 5;
            this.manaCost = 15;
        }

        public void castSpell() {
            System.out.println("Fireball! Dealt " + this.damage + " damage. Cost: " + this.manaCost);
        }

        public int getManaCost() {
            return this.manaCost;
        }
}
