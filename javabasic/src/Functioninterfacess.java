public class Functioninterfacess {
    @FunctionalInterface
    interface Flyable {
        void fly(int i, int j);

        // Default method
        default void glide() {
            System.out.println("Flying with a glide!");
        }
    }

    @FunctionalInterface
    interface Swimmable {
        void swim();

        // Default method
        default void dive() {
            System.out.println("Swimming with a dive!");
        }
    }
}
