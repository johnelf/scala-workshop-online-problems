package models;

import java.util.List;

public class UserSummary {
    public String username;
    public List<String> solvedProblems;
    public long lastSubmitTime;

    public boolean hasSubmitted() {
        return lastSubmitTime > 0;
    }

    public int getLastSubmitFromNow() {
        long diff = System.currentTimeMillis() - lastSubmitTime;
        return (int) (diff / (1000.0 * 60 * 60));
    }
}
