public class Player {

    private String name;
    private int level;
    private int xp;

    public Player(String name) {
        this.name = "Mark";
        this.level = 1;
        this.xp = 0;
    }

    public void addXP(int amount) {
        xp += amount;
        checkLevelUp();
    }

    private void checkLevelUp() {
        int requiredXP = level * 100;

        while (xp >= requiredXP) {
            xp -= requiredXP;
            level++;
            requiredXP = level * 100;

            System.out.println(name + " leveled up! Now level " + level);
        }
    }

    public void showStats() {
        System.out.println("Player: " + name + " | Level: " + level + " | XP: " + xp);
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}