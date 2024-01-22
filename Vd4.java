
package laptrinhmang1.week3;

public class Vd4 {
    private final Object lc=new Object();
    //phuong thuc duoc dong bo
    public synchronized void phuongThuc1()
    {
        
    }
    public synchronized void phuongThuc2()
    {
        synchronized (lc)
        {
            
        }
    }
        public static void main (String[] args){
            Thread th=new Thread(()->{
                //---
            });
            th.start();//bat dau tien trinh
            try{
            th.join();//cho tien trinh khac hoan toan thanh thi moi thuc hien
            } catch (Exception e){
                e.printStackTrace();
            }
            //in ra ket qua cuoi cung cua bien count
            System.out.println("Count cuoi cung:" +counter.getCount());
            
        }

