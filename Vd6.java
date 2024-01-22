package laptrinhmang1.week3;
public class Vd6 {
    private final Object monitor = new Object();
    private boolean isDataReady = false;

    public void productData() throws InterruptedException {
        synchronized (monitor) {
            while (isDataReady) {
                monitor.wait();
            }

            System.out.println("San xuat data");
            Thread.sleep(2000);
            //set trang thais du lieu
            isDataReady = true;
            if (isDataReady) {
                monitor.notify();
            }
        }
    }

    public void useData() throws InterruptedException {
        synchronized (monitor) {
            while (!isDataReady) {
                monitor.wait();
            }

            System.out.println("Su dung du lieu....");
            Thread.sleep(3000);
            isDataReady = false;
            monitor.notify();
        }
    }

    public static void main(String[] args) {
        Vd6 ex = new Vd6();
        Thread thsanxuat = new Thread(() -> {
            try {
                while (true) {
                    ex.productData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread thsudung = new Thread(() -> {
            try {
                while (true) {
                    ex.useData();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thsanxuat.start();
        thsudung.start();
    }
}
