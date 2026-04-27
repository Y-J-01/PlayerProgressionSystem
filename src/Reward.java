public class Reward {
    private String name;

    public Reward(String name) {
        this.name = name;
    }

    public void give(Player player) {
        System.out.println(player + " received reward: " + name);
    }
}
