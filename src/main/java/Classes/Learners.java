package Classes;

import java.util.HashMap;
import java.util.Map;

public class Learners extends Person {
    Map<String, Integer> hash = new HashMap<String, Integer>();
    private String username = "";
    private String surname = "";
    private String email = "";


    public void setLearner() {
        this.username = getName();
        try {
            if (!hash.containsKey(username)) {
                this.hash.put(username, 0);
            }

            if (hash.containsKey(username)) {
                int counterLearner = this.hash.get(username);
                counterLearner++;
                this.hash.put(username, counterLearner);
            }
        } catch (Exception ex) {
            System.out.println("fail!");
        }
    }

    public void qualifiedLearner() {
        this.username = getName();
        int amountLearner = hash.get(username);
        try {
            if (amountLearner > 3) {
                System.out.println("not valued!");
            }
            if (amountLearner <= 3) {
                System.out.println("valued");
            }
        } catch (Exception ex) {
            System.out.println("fail!");
        }
    }
}
