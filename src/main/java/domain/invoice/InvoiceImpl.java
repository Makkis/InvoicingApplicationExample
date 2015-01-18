package domain.invoice;

import java.time.LocalDate;
import java.util.UUID;

public class InvoiceImpl implements Invoice {

    private UUID id;
    private String number;
    private LocalDate dueDate;
    
    public InvoiceImpl(UUID uuid, String number, LocalDate dueDate) {
        this.id = uuid;
        this.number = number;
        this.dueDate = dueDate;
    }

    @Override
    public void changeDueDate(LocalDate newDueDate) {
        this.dueDate = newDueDate;
    }
}
