package chapter6;

public class Bus {
    private String sound;

    public Bus(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
