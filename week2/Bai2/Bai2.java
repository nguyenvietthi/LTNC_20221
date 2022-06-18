public class Bai2 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.setChannel(20);
        tv.setVolume(3);
        tv.volumeUp();
        tv.channelDown();
        tv.turnOff();
    }
}