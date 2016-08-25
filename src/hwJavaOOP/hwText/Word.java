package hwJavaOOP.hwText;


public class Word {
    private String word;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public Word setWord(String word) {
        this.word = word;
        return this;
    }

    @Override
    public String toString() {
        return word;
    }
}
