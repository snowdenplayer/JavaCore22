public class Car {

    private String type;
    private String color;
    int age;
    int speed;

    public Car(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public Car(String type, String color, int age) {
        this(type, color);
        this.age = age;
    }

    public Car(String type, String color, int age, int speed) {
        this(type, color, age);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car [type=" + type + ", color=" + color + ", age=" + age + ", speed=" + speed + "]";
    }

}