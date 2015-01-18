package domain.invoice;

import java.time.LocalDate;
import java.util.UUID;

public interface InvoiceSerializer {
    void serialize(UUID id, String number, LocalDate dueDate);
}
