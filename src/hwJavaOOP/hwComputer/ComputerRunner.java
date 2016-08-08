package hwJavaOOP.hwComputer;

//Блинов. Глава 4. Вариант А. 7 (*). Создать  объект  класса Компьютер,  используя  классы  Винчестер, Дисковод,
// Оперативная память, Процессор. Методы: включить, выключить, проверить на вирусы, вывести на консоль
// размер винчестера.
public class ComputerRunner {
    public static void main(String[] args) throws InterruptedException {
        Computer comp = ComputerUtils.createComp();

        comp.turnOn();
        System.out.println();
        comp.virusCheck();
        System.out.println();
        System.out.println(comp.hdd);
        System.out.println("HDD capacity is: " + comp.hdd.getCapacity());
        System.out.println();
        comp.turnOff();
    }

}
