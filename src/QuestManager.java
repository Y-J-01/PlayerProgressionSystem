import java.util.ArrayList;
import java.util.List;

public class QuestManager {
    private List<Quest> quests = new ArrayList<>();

    public void addQuest(Quest quest) {
        quests.add(quest);
    }

    public void showQuests() {
        for (Quest q : quests) {
            System.out.println(q.getTitle() + " | Completed: " + q.isCompleted());
        }
    }

    public List<Quest> getQuests() {
        return quests;
    }
}