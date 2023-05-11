package ss4_oop.bai_tap.fan;

public class Fan {
    final byte SLOW = 1;
    final byte MEDIUM = 2;
    final byte FAST = 3;

    private int speed;
    private boolean status;

    private double radius;

    private String corlor;

    public Fan(int speed, boolean onOrOff, double radius, String corlor) {
        this.speed = speed;
        status = onOrOff;
        this.radius = radius;
        this.corlor = corlor;
    }

    @Override
    public String toString() {
        if (this.status) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", corlor='" + corlor + '\'' +
                    ", fan is on"+
                    '}';
        } else {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", corlor='" + corlor + '\'' +
                    ", fan is off"+
                    '}';
        }
    }

    public Fan() {
        this.speed=SLOW;
        this.status = false;
        this.radius=5;
        this.corlor="blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOnOrOff() {
        return status;
    }

    public void setOnOrOff(boolean onOrOff) {
        status = onOrOff;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getCorlor() {
        return corlor;
    }

    public void setCorlor(String corlor) {
        this.corlor = corlor;
    }
}
