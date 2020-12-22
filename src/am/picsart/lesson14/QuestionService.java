package am.picsart.lesson14;

import java.util.*;

public class QuestionService {
    private Map<Section, Set<String>> storage;

    public QuestionService(String path) {
        storage = new EnumMap<Section, Set<String>>(Section.class);
        init(path);
    }

    private void init(String path) {
        List<String> allLines = FileService.read(path);
        for (String line : allLines) {
            String[] split = line.split(":");
            Section section = Section.getSection(split[0]);
            if (storage.containsKey(section)) {
                storage.get(section).add(split[1]);
            } else {
                storage.put(section, new LinkedHashSet<>(Collections.singleton(split[1])));
            }
        }
    }

    public void printQuestion(String section) {
        System.out.println(storage.get(Section.getSection(section)));
    }
}
