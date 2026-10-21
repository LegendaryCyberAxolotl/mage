public class FATAL implements Spells{
    private int manaCost;

    public FATAL() {
        this.manaCost = 150;
    }

    public void castSpell() {
        System.out.println("EVERYONE IS DEAD HAHAHAHA!!!!!");
    }

    public int getManaCost() {
        return this.manaCost;
    }
}
