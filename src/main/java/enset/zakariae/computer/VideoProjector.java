package enset.zakariae.computer;

public class VideoProjector implements VGA {
    @Override
    public void print(String message) {
        System.out.println("**************VideoProjector****************");
        System.out.println(message);
        System.out.println("**************VideoProjector****************");
    }
}
