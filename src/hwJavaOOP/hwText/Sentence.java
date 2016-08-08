package hwJavaOOP.hwText;

import java.util.ArrayList;

public class Sentence {

    private ArrayList<Word> sentence = new ArrayList<>();

    public Sentence() {
    }

    public ArrayList<Word> getSentence() {
        return sentence;
    }

    public Sentence setSentence(Word w) {
        this.sentence.add(w);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.size(); i++) {
            if (i == 0) {
                Word w = sentence.get(i);
                String s = w.toString();
                sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
            } else if (i == sentence.size() - 1) sb.append(sentence.get(i)).append(".");
            else sb.append(sentence.get(i)).append(" ");
        }

        return sb.toString();
    }
}
