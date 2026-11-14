public class CompletableFuture {
    public static void main(String[] args)
    {
        java.util.concurrent.CompletableFuture<String> biryani = java.util.concurrent.CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            return "Biryani Ready!";
        });
        java.util.concurrent.CompletableFuture<String> coke = java.util.concurrent.CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            return "Coke Ready!";
        });

        System.out.println(biryani.join() + " + " + coke.join());
    }
}
