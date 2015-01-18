package domain.invoice;

import java.time.LocalDate;

public interface Invoice {
    void changeDueDate(LocalDate newDueDate);
    void serialize(InvoiceSerializer invoiceSerializer);
}
