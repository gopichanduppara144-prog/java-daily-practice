class MyTask implements Runnable {
    // volatile lekpothe, inkoka thread ki ee change kanipinchadu mawa!
    volatile boolean running = true;

    public void run(){
        System.out.println("Thread start ayindhi, running = true");
        while(running){
            // Pani chesthune untadhi
        }
        System.out.println("Thread aagipoyindhi!");
    }
    public void stopIt(){ running = false; }
}

public class Volatile {
    public static void main(String[] args) throws Exception {
        MyTask task = new MyTask();
        Thread t1 = new Thread(task);
        t1.start();
        Thread.sleep(1000);
        System.out.println("Main: Ippudu aaputhunna!");
        task.stopIt(); // running = false
        t1.join();
        System.out.println("Main: Done!");
    }
}