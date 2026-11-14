public class DeadLock {
    static Object pen = new Object();
    static Object book = new Object();

    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            synchronized(pen){
                System.out.println("Gopi: Pen pattukunna, Book kavali!");
                try{ Thread.sleep(100); } catch(Exception e){}
                synchronized(book){
                    System.out.println("Gopi: Book kuda vachindhi!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(book){
                System.out.println("Ravi: Book pattukunna, Pen kavali!");
                try{ Thread.sleep(100); } catch(Exception e){}
                synchronized(pen){
                    System.out.println("Ravi: Pen kuda vachindhi!");
                }
            }
        });
        t1.start();
        t2.start();
    }
}