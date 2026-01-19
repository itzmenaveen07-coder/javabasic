abstract class Animals {
    abstract void sound();
}

//// ❌ Not allowed
//Animal a = new Animal();   // Compile-time error
class Dogs extends Animals {
    void sound() {
        System.out.println("Dog barks");
    }
}

