public class MindControl implements Spells {
        private int time;
        private int radius;
        private int manaCost;

        public MindControl() {
            this.time = 5;
            this.radius = 10;
            this.manaCost = 20;
        }

        public void castSpell() {
            System.out.println("Mind Control! The target will be controlled for " + this.time + " minutes. Cost: " + this.manaCost);
        }

        public int getManaCost() {
            return this.manaCost;
        }
}
