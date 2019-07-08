public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off, look it's beautiful !%n", this.getName());
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flies upward, it's amazing his altitude is now %d meters !%n", this.getName(), this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.flying && this.altitude > 0) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, he is coming on us, care, his altitude is now %d meters !%n", this.getName(), this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude <= 3) {
            this.altitude = 0;
            this.flying = false;
            System.out.printf("Oh god, I can't believe it, %s is just here ! He landed right in front of us, RUN !%n", this.getName());
        } else {
            System.out.printf("%s can't land, his altitude is too high ! It's %d meters !%n", this.getName(), this.getAltitude());
        }
    }


}
