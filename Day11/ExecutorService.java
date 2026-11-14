import java.util.concurrent.Executors;

public class ExecutorService {
    public static void main(String[] args){
        // 5 mandi waiters ready mawa!
        java.util.concurrent.ExecutorService pool = Executors.newFixedThreadPool(5);

        for(int i=1; i<=10; i++){
            int taskNo = i;
            pool.execute(() -> {
                System.out.println("Task " + taskNo + " chesthunnadu: " + Thread.currentThread().getName());
                try{ Thread.sleep(500); } catch(Exception e){}
            });
        }
        pool.shutdown(); // Hotel close chesthunam mawa!
    }
}