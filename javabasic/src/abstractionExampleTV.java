public abstract class abstractionExampleTV
{
    abstract void turnon();
    abstract  void turnoff();
}
class tvremote extends abstractionExampleTV
{
    @Override
    void turnon()
    {
        System.out.println("TV is turned ON.");
    }
    @Override
    void turnoff() {
        System.out.println(" TV is turned off.");
    }
}
    class tvbattery extends abstractionExampleTV {

        @Override
        void turnon() {
            System.out.println("battery working");
        }

        @Override
        void turnoff() {
            System.out.println(" Battery not working");
        }

}