
public class Bai5 {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
       
        try {
            watch.start();
            Thread.sleep(1);
            watch.stop();
            System.out.println("Elapsed Time: " + watch.getElapsedTime());
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
