import java.util.*;
class BrowserHistory {
    ArrayList<String> list = new ArrayList<>();
    int current = 0;
    public BrowserHistory(String homepage) {
        list.add(homepage);
    }

    public void visit(String url) {
        while (list.size() > current + 1) {
            list.remove(list.size() - 1);
        }

        list.add(url);
        current++;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return list.get(current);
    }

    public String forward(int steps) {
        current = Math.min(list.size() - 1, current + steps);
        return list.get(current);
    }
}
