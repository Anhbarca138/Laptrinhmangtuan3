
package laptrinhmang1.week3;

public class Vd3 {
    private int count=0;
    //phuong thuc 1 dong bo hoa
    public synchronized void increment()
    {
        count++;
    }
    //phuong thuc 2 dong bo hoa
    public synchronized void decrement()
    {
        count-=2;
    }
    //phuong thuc 3 khong dong bo hoa
    public int getCount()
    {
        return count;
    }
    public static void main(String[] args){
        Vd3 counter=new Vd3();
        //tao cac luong de tang va giam
        Thread incrementThread=new Thread(()->{
            for (int i=0;i<1000;i++)
            {
                counter.increment();
            }
        });
        //tao ra luong dem giam
        Thread decrementThread=new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                counter.decrement();
            }
        });
        //khoi chay cac luong
        incrementThread.start();
        decrementThread.start();
        try{
            //cho doi cho den khi cac luong hoan thanh
            incrementThread.join();
            decrementThread.join();
        } catch (Exception e){
            e.printStackTrace();
        }
        //in ra ket qua cuoi cung cua bien count
        System.out.println("Count cuoi cung"+counter.getCount());
    }
    
}
