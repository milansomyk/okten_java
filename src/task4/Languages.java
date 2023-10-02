package task4;

public enum Languages {
    JAVA("java"),
    JS("js"),
    CPP("c++");
    private final String language;
    Languages(String language){this.language = language;}

    @Override
    public String toString() {
        return language;
    }
}
