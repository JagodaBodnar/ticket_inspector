import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime timeOfPurchase;

    private int validityTime;

    public void setTimeOfPurchase(LocalDateTime timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }

    public void setValidityTime(int validityTime) {
        this.validityTime = validityTime;
    }

    public Ticket(LocalDateTime timeOfPurchase, int validityTime){
        setTimeOfPurchase(timeOfPurchase);
        setValidityTime(validityTime);
    }

    public boolean isTicketValid(){
        Duration duration = Duration.between(timeOfPurchase,LocalDateTime.now());
        return duration.toMinutes() < validityTime;
    }
}
