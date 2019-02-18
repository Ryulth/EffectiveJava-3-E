package chapter6;

public class Car implements Vehicle {
    private String  sound;


    public Car(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString(){
        return sound;
    }

    public String  getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


}
