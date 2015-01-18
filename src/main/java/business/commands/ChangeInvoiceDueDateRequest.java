package business.commands;

import java.time.LocalDate;

public class ChangeInvoiceDueDateRequest {

    private String number;
    private LocalDate newDuedate;
    
    public ChangeInvoiceDueDateRequest(String invoiceNumber, LocalDate newDueDate) {
        number = invoiceNumber;
        newDuedate = newDueDate;
    }

    public String getNumber() {
        return number;
    }
    public LocalDate getNewDueDate() {
        return newDuedate;
    }
}
