public class Mage {
    private int maxMana;
    private int currentMana;
    private Spells spell;

    public Mage(int mana) {
        this.maxMana = mana;
        this.currentMana = this.maxMana;
    }

    public void setSpell(Spells spell) {
        this.spell = spell;
    }

    public void restoreMana(int value) {
        this.currentMana += value;
        if (this.currentMana > this.maxMana) {
            this.currentMana = this.maxMana;
        }
    }

    public void castSpell() {
        int cost = this.spell.getManaCost();
        if (this.currentMana < cost) {
            System.out.println("Not enough mana!");
            return;
        }

        this.currentMana -= cost;
        this.spell.castSpell();

        if (this.currentMana == 0) {
            System.out.println("No mana left, restore your mana!");
        }
    }
}
