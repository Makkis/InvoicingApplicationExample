package domain.invoice;

import java.util.UUID;

public interface InvoiceRepository {

    Invoice getById(UUID id);
    Invoice getByNumber(String invoiceNumber);

    void save(Invoice invoice);
}
