public interface Fly {

    void takeOff();

    int ascend(int meters);

    int descend(int meters);

    void land();

    default String glide() {
        return "It glides into the air";
    }
}