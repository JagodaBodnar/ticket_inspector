import java.time.LocalDateTime;

public class TicketMachine {
    public static void buyTicket(Passenger passenger, int timeMinutes){
        Ticket ticket = new Ticket(LocalDateTime.now(), timeMinutes);
        passenger.setTicket(ticket);
    }
}
