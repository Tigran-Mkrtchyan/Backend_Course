package am.picsart.lesson14;

public enum Section {
    OOP,
    EXCEPTION,
    BASIC;

    public static Section getSection(String name){
        for (Section section: Section.values()){
            if (name.toUpperCase().equals(section.name())){
                return section;
            }
        }
        throw new RuntimeException("Unknown Section");
    }
}
