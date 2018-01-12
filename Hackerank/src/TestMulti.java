
public class TestMulti {

    public static void main(String[] args) throws InterruptedException {
        int array[] = new int[100];
        for(int i=0;i<100;i++)
            array[i]=i+1;

        ArrayReader reader = new ArrayReader(array);

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0;i<array.length;i++)
                reader.readEven();
            }
        });
        t1.setName("EvenReader");
        t1.start();

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0;i<array.length;i++)
                reader.readOdd();
            }
        });
        t2.setName("OddReader");
        t2.start();


    }

}

class ArrayReader {

    int array[];
    int index = 0;

    public ArrayReader(int array[]) {
        this.array = array;
    }

    public synchronized void readOdd() {

        try {
            if (index % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + array[index]);
                index++;
                notify();
            } else {

                wait();

            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public synchronized void readEven() {

        try {
            if (index % 2 != 0) {
                wait();

            } else {
                System.out.println(Thread.currentThread().getName() + ":" + array[index]);
                index++;
                notify();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
