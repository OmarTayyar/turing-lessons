package module01.comparator;

public class Player {
    private String name;
    private int age;
    private int score;
    private boolean isMale;

    public Player(String name, int age, int score, boolean isMale) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", age=" + age + ", score=" + score+ ", isMale=" + isMale + "]";
    }
}
