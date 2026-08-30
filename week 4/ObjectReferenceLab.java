class ScoreBox {
    private int score;

    ScoreBox(int score) {
        if (score >= 0)
            this.score = score;
        else
            this.score = 0;
    }

    int getScore() {
        return score;
    }

    void add(int value) {
        if (value >= 0)
            score = score + value;
    }
}

public class ObjectReferenceLab {

    static void addBonus(ScoreBox box, int bonus) {
        box.add(bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(100);
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {

        ScoreBox first = new ScoreBox(50);
        ScoreBox second = first;
        ScoreBox third = new ScoreBox(20);

        addBonus(second, 10);

        System.out.println(first.getScore());
        System.out.println(second.getScore());

        replaceLocally(first);
        System.out.println(first.getScore());

        ScoreBox fourth = createScoreBox(80);

        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(fourth == first);
    }
}
