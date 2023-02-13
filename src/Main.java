public class Main {
    public static void main(String[] args) {
        task123();
        task4();
        task5();
        task67();
        task8();
    }

    public static void task123() {
        System.out.println("Задача1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task67() {
        System.out.println("Задача6");
        var weight1 = 78.2;
        var weight2 = 82.7;
        var weightall = weight1 + weight2;
        System.out.println("Общий вес двух бойцов " + weightall + " кг");
        var weightdiff = weight2 % weight1;
        System.out.println("Разница между весами бойцов" + weightdiff + " кг");
        System.out.println("Задача7");
        var minus = weight2 - weight1;
        System.out.println("вычитание " + minus);
        var rem = weight2 % weight1;
        System.out.println("Остаток от деления " + rem);
    }

    public static void task8() {
        System.out.println("Задача8-1");
        var alltime = 640;
        var timework = 8;
        var allworker = alltime / timework;
        System.out.println("Всего работников в компании - " + allworker + " человек");
        System.out.println("Задача 8-2");
        var worker = allworker + 94;
        var timeworker2 = worker * 8;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + timeworker2 + " часов работы может быть поделено между сотрудниками");
    }
}