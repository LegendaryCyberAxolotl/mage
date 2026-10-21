public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage(100);
        mage.setSpell(new Fireball());

        mage.castSpell();
        mage.castSpell();

        mage.setSpell(new Poison());

        mage.castSpell();

        mage.setSpell(new MindControl());
        
        mage.castSpell();

        mage.restoreMana(100);

        mage.setSpell(new FATAL());
        mage.castSpell();
    }
}
