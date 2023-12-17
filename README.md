## Instruction

>Write a program that will simulate ticket inspector role. 
>The tickets are assigned electronically and have time limit.
>Define classes:
>* Ticket - that holds information about the time when the ticket was purchased, and it's validity (in minutes).
>* Passenger - representing passenger. Holds information about name and surname. 
>Can also have an object Ticket and that means that passenger purchased ticket.
>* TicketMachine - represents ticket machine. It has only one method buyTicket that
>takes as parameter passenger and validity time of the ticket. 
>Method should create ticket and assign it to passenger object.
>* Ticket Controller  - class create array of passengers and assign tickets to some
>(some of the tickets should be outdated). 
>Define a method that will help to find, which passengers have valid tickets. 
>In result method should return array of passengers without valid ticker.