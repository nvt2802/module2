package ss5_modifier.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        Car car2 = new Car("Mazda 6","Skyactiv 6");
        Car car3 = new Car("Mazda 6","Skyactiv 6");
        Car car4 = new Car("Mazda 6","Skyactiv 6");
        Car car5 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);

    }
}
