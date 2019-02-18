package chapter6;

public class VehicleMaker {
    public static void main(String[] args){
        makeSound(new Car("빵빵"));
        //makeSound(new Bus("뻥뻥"));
    }
    private static void makeSound(Vehicle vehicle){
        System.out.println(vehicle.toString());
    }
}
