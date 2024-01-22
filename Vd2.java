
package laptrinhmang1.week3;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Vd2 {
    private int count=0;
    private Lock lc=new ReentrantLock();//tao khoa 
    public void demTang()
    {
        lc.lock();
        try{
            count++;
        } catch (Exception e){
    }
    finally{
            lc.unlock();//mo cac tien trinh khac
        }
}
}
