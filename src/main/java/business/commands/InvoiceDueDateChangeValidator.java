package business.commands;

import java.time.LocalDate;

public class InvoiceDueDateChangeValidator {
    
    public boolean isDueDateValid(LocalDate duedate) {
        // Dummy validation for illustration purposes
        return LocalDate.now().isBefore(duedate);
    }
}
