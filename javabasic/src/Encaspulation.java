import java.awt.event.ActionListener;

public class Encaspulation
{

    // Examples for getters and setters
    private String name; // Encapsulation
    public int age;

    public void encaspulation()// default constructor
    {
        System.out.println("default constructor");
    }

    public Encaspulation(String name, int age) // parametrized constructor
    {
        this.name = name;
        this.age = age;
        System.out.println(name + " age is " + age);
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;

    }

//    Encapsulation

    public static class Car
    {

        private String color;
        private int speed;

        public Car(){

        }
        public Car(String color, int speed)
        {
            setColor(color);
            setSpeed(speed);

        }

        public String getColor()
        {
            return color;
        }

        public void setColor(String color)
        {
            if (color == null || color.isBlank())
            {
                throw new IllegalArgumentException(" color cananot be null");
            }
            this.color = color.trim();
        }

        public int getSpeed()
        {
            return speed;
        }
        public void setSpeed(int speed)
        {
            if (speed <= 0)
            {
                throw new IllegalArgumentException("speed cannot be negative");
            }
            this.speed=speed;
        }
        public void start() {
            System.out.println(color + " car is starting at " + speed + " km/h");
        }

    }

}
