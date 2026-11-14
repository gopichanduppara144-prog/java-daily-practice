class MyThread extends Thread {
    public void run(){
        System.out.println("1. RUNNING - Pani chesthunna");
        try{
            System.out.println("2. TIMED_WAITING - 1 sec padukuntunna");
            Thread.sleep(1000);
        } catch(Exception e){}
        System.out.println("3. Malli RUNNING - Lechesa!");
    }
}

public class Day11ThreadLifeCycle {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        System.out.println("NEW - State: " + t1.getState()); // NEW
        
        t1.start();
        System.out.println("RUNNABLE - State: " + t1.getState()); // RUNNABLE
        
        t1.join(); // t1 ayipoye varaku main aaguthadhi
        System.out.println("TERMINATED - State: " + t1.getState()); // TERMINATED
    }
}