package domain.invoice;

import java.util.UUID;

import business.api.InvoiceDto;

public interface InvoiceAdapter {

    public abstract void save(InvoiceDto invoice);
    public abstract InvoiceDto getByNumber(String invoiceNumber);
    public abstract InvoiceDto getById(UUID id);
}
