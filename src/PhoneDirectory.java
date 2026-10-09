import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    Map<String, List<String>> directory = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        if (!directory.containsKey(surname)) {
            directory.put(surname, new ArrayList<>());
        }
        directory.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        if (directory.containsKey(surname)) {
            return directory.get(surname);
        }
        return new ArrayList<>();
    }
}

