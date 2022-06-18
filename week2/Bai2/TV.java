public class TV {
    int channel;
    int volumeLevel;
    boolean on;

    public TV() {
        this.channel = 1;
        this.volumeLevel = 1;
        this.on = false;
    }

    public void turnOn(){
        this.on = true;
        System.out.println("Turns on this TV");
    }

    public void turnOff(){
        this.on = false;
        System.out.println("Turns off this TV");
    }

    public void setChannel(int newChannel) {
        System.out.println("Current channel: " + newChannel);
        this.channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        System.out.println("Current volume level: " + newVolumeLevel);
        this.volumeLevel = newVolumeLevel;
    }

    public void channelUp(){
        this.channel++;
        System.out.println("Current channel: " + this.channel);
    }

    public void channelDown() {
        this.channel--;
        System.out.println("Current channel: " + this.channel);
    }

    public void volumeUp(){
        this.volumeLevel++;
        System.out.println("Current volume level: " + this.volumeLevel);
    }

    public void volumeDown(){
        this.volumeLevel--;
        System.out.println("Current volume level: " + this.volumeLevel);
    }
}
