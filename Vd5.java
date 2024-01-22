
package laptrinhmang1.week3;

public class Vd5 {
    private final Object monitor = new Object();
    public void waitForSignal() throws InterruptedException
    {
        synchronized(monitor)
        {
            monitor.wait();//tien trinh se treo cho den khi notify
        }
    }
    public void notifySignal()
    {
        synchronized(monitor)
        {
            monitor .notify();
        }
    }
}
