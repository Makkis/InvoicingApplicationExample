package domain.invoice;

import java.util.UUID;

import javax.inject.Inject;

import business.api.InvoiceDto;
import business.api.InvoiceDtoBuilder;

public class InvoiceRepositoryImpl implements InvoiceRepository {

    private @Inject InvoiceFactory invoiceFactory;
    private @Inject InvoiceAdapter adapter;

    @Override
    public Invoice getById(UUID id) {
        return reconstitute(adapter.getById(id));
    }

    @Override
    public Invoice getByNumber(String invoiceNumber) {
        return reconstitute(adapter.getByNumber(invoiceNumber));
    }

    @Override
    public void save(Invoice invoice) {
        InvoiceDtoBuilder dtoBuilder = new InvoiceDtoBuilder();
        invoice.serialize(dtoBuilder);
        adapter.save(dtoBuilder.build());
    }

    private Invoice reconstitute(InvoiceDto invoiceDto) {
        return invoiceFactory.reconstitute(invoiceDto.getId(), invoiceDto.getNumber(), invoiceDto.getDueDate());
    }
}
