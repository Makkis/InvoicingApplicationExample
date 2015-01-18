package domain.invoice;

import java.time.LocalDate;
import java.util.UUID;

public class InvoiceFactory {

    public Invoice create(String number, LocalDate dueDate)
    {
        return new InvoiceImpl(UUID.randomUUID(), number, dueDate);
    }

    public Invoice reconstitute(UUID uuid, String number, LocalDate dueDate)
    {
        return new InvoiceImpl(uuid, number, dueDate);
    }
}
