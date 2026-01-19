import java.util.HashSet;
import java.util.Set;

class Parent {
      void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    @Override
     void show() {
        System.out.println("Child show()");
    }
}