
class Control {
    boolean hiTurn = true;         // Hi prints first
    int hiCount = 0;
    int helloCount = 0;
}

class A extends Thread {
    Control c;

    A() { this.c = c; }

    public void run() {
        for (int i = 1; i <= 100; ) {
            synchronized (c) {
                while (!c.hiTurn) {      // Wait until it's Hi's turn
                    try { c.wait(); }
                    catch (InterruptedException e) {}
                }

                System.out.println("Hi");
                c.hiCount++;
                i++;

                if (c.hiCount == 10) {   // Finished 10 HI
                    c.hiTurn = false;    // Switch to HELLO
                    c.hiCount = 0;
                    c.notifyAll();
                    try { Thread.sleep(7000); } // sleep after batch
                    catch (Exception e) {}
                }
            }
        }
    }
}

class B extends Thread {
    Control c;

    B() { this.c = c; }

    public void run() {
        for (int i = 1; i <= 100; ) {
            synchronized (c) {
                while (c.hiTurn) {        // Wait until it's Hello's turn
                    try { c.wait(); }
                    catch (InterruptedException e) {}
                }

                System.out.println("Hello");
                c.helloCount++;
                i++;

                if (c.helloCount == 10) { // Finished 10 HELLO
                    c.hiTurn = true;      // Switch to HI
                    c.helloCount = 0;
                    c.notifyAll();
                    try { Thread.sleep(7000); } // sleep after batch
                    catch (Exception e) {}
                }
            }
        }
    }
}

