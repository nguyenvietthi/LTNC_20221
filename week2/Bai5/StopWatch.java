import java.time.Duration;
import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime stopTime;

    public StopWatch() {
        startTime = LocalDateTime.now();
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getStopTime() {
        return stopTime;
    }

    public void setStopTime(LocalDateTime stopTime) {
        this.stopTime = stopTime;
    }

    public void start(){
        startTime = LocalDateTime.now();
    }
    
    public void stop(){
        stopTime = LocalDateTime.now();
    }

    public long getElapsedTime(){
        return  Duration.between(startTime, stopTime).toMillis();
    }
        
}
