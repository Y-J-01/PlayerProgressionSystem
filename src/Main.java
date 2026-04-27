public class Main {
    public static void main(String[] args) {

        Player player = new Player("Hero");

        QuestManager manager = new QuestManager();

        Quest q1 = new Quest("Defeat 10 enemies", 120);
        Quest q2 = new Quest("Explore the forest", 80);

        manager.addQuest(q1);
        manager.addQuest(q2);

        player.showStats();

        q1.complete(player);
        q2.complete(player);

        player.showStats();

        manager.showQuests();
    }
}