package hwJavaOOP.hwText;
//Блинов. Глава 4. Вариант А. 1 (*). Создать  объект  класса Текст,  используя  классы  Предложение,
// Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class TextRunner {
    public static void main(String[] args) {
        Text txt = new Text();
        Sentence snt1 = new Sentence();
        Sentence snt2 = new Sentence();
        Sentence bonus = new Sentence();

        Word w1 = new Word("words");
        Word bonW = new Word("bonus");

        snt1.setSentence(w1);
        snt1.setSentence(w1);
        snt1.setSentence(w1);
        snt1.setSentence(w1);
        snt1.setSentence(w1);

        snt2.setSentence(w1);
        snt2.setSentence(w1);
        snt2.setSentence(w1);
        snt2.setSentence(w1);
        snt2.setSentence(w1);

        bonus.setSentence(bonW);
        bonus.setSentence(bonW);
        bonus.setSentence(bonW);

        txt.setHeader("words");
        txt.setText(snt1);
        txt.setText(snt2);

        System.out.println(txt);

        txt.addSentence(1, bonus);
        System.out.println();
        System.out.println(txt);

    }
}
