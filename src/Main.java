public class Main {
    public static void main(String[] args) {
        Pet dog = (s)->System.out.println(s);
        Pet cat = (s)->System.out.println(s);
        Pet cow = (s)->System.out.println(s);
        dog.voice("Gav");
        cat.voice("Miay");
        cow.voice("myy");



        konstrCar car = Car::new;
        konstr2Car car1 = Car::new;
        konstr3Car car2 = Car::new;

        System.out.println(car.creat("hetchbek","blue"));
        System.out.println(car1.creat("sedan", "black", 10));
        System.out.println(car2.creat("pikap", "red", 9, 90));

        Amphibia frogEat = ()->System.out.println(" eat");
        Amphibia frogSleep = ()->System.out.println("sleep!");
        Amphibia frogSwim = ()->System.out.println("swim!");
        Amphibia frogWalk = ()->System.out.println("walk!");

    }
}

interface Amphibia{
    void metod();
}
interface konstrCar{
    Car creat(String type, String color);
}

interface konstr2Car{
    Car creat(String type, String color, int age);
}

interface konstr3Car{
    Car creat(String type, String color, int age, int speed);
}

