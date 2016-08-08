package hwJavaOOP.hwText;

import java.util.ArrayList;

public class Text {
    private String header;
    private ArrayList<Sentence> text = new ArrayList<>();

    public Text() {
    }

    public Text(ArrayList<Sentence> text) {
        this.text = text;
    }

    public Text addSentence(Sentence s) {
        this.text.add(s);
        return this;
    }

    public Text addSentence(int n, Sentence s) {
        this.text.add(n, s);
        return this;
    }

    public String getHeader() {
        return header;
    }

    public Text setHeader(String header) {
        this.header = header;
        return this;
    }

    public ArrayList<Sentence> getText() {
        return text;
    }

    public Text setText(Sentence text) {
        this.text.add(text);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (header != null) sb.append(this.header.toUpperCase()).append(".").append("\n");
        for (int i = 0; i < text.size(); i++) {
            sb.append(text.get(i)).append(" ");
        }
        return sb.toString();
    }
}
