package business.api;

import java.time.LocalDate;
import java.util.UUID;

import domain.invoice.InvoiceSerializer;

public class InvoiceDtoBuilder implements InvoiceSerializer {

    private InvoiceDto dto;

    @Override
    public void serialize(UUID id, String number, LocalDate dueDate) {
        this.dto = new InvoiceDto(id, number, dueDate);
    }
    
    public InvoiceDto build() {
        return dto;
    }
}
