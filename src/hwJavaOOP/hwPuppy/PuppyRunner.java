package hwJavaOOP.hwPuppy;
//Создать  объект  класса Щенок,  используя  классы  Животное,  Собака.
// Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.

public class PuppyRunner {
    public static void main(String[] args) {
        Dog lessie = new Puppy("Lessie", 0.3, 8);
        System.out.println(lessie);
        System.out.println("Puppy name is " + lessie.getName());
        lessie.doBark();
        lessie.doJump();
        lessie.doRun();
        lessie.doBite();
    }


}
