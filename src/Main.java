public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var differrenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов " + differrenceWeight + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var differenceWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Второй боец тяжелее на " + differenceWeight + " кг");
    }
        public static void task8 () {
        System.out.println("Задача 8");
        var CommonWorkingHours1 = 640;
        var oneEmployeeWorkingHours = 8;
        var numberEmployees = CommonWorkingHours1 / oneEmployeeWorkingHours;
        System.out.println("Всего работников в компании - " + numberEmployees + " человек");
        var numberEmployees1 = numberEmployees + 94;
        var commonWorkingHours2 = numberEmployees1 * oneEmployeeWorkingHours;
        System.out.println("Если в компании работает " + numberEmployees1 + " человек, то всего " + commonWorkingHours2 + " часов работы может быть поделено между сотрудниками");
    }
}