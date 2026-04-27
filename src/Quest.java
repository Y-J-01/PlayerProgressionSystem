public class Quest {
    private String title;
    private int xpReward;
    private boolean completed;

    public Quest(String title, int xpReward) {
        this.title = title;
        this.xpReward = xpReward;
        this.completed = false;
    }

    public void complete(Player player) {
        if (!completed) {
            completed = true;
            player.addXP(xpReward);
            System.out.println("Quest completed: " + title);
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }
}
