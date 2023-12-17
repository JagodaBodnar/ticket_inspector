import java.time.LocalDateTime;

public class TicketController {
    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[5];
        passengers[0] = new Passenger("John", "Smith");
        passengers[1] = new Passenger("Jane", "Johnson");
        passengers[2] = new Passenger("Jack", "Williams");
        passengers[3] = new Passenger("Maggie", "Jones");
        passengers[4] = new Passenger("Jim", "Brown");
        TicketController.assignTickets(passengers);
        TicketController.findPassengersWithInvalidTicket(passengers);

    }

    public static void assignTickets(Passenger[] passengers) {
        TicketMachine.buyTicket(passengers[0], 15);
        TicketMachine.buyTicket(passengers[1], 15);
        TicketMachine.buyTicket(passengers[4], 20);
        Ticket invalidTicket = new Ticket(LocalDateTime.now().minusMinutes(20), 15);
        passengers[2].setTicket(invalidTicket);
        Ticket invalidTicket2 = new Ticket(LocalDateTime.now().minusMinutes(30), 15);
        passengers[0].setTicket(invalidTicket2);
        passengers[3].setTicket(invalidTicket);
    }

    public static void findPassengersWithInvalidTicket(Passenger[] passengers) {
        for (int i = 0; i < passengers.length; i++) {
            if (!passengers[i].getTicket().isTicketValid()){
                System.out.printf("%s %s %n", passengers[i].getName(), passengers[i].getSurname());
            }
        }
    }
}
