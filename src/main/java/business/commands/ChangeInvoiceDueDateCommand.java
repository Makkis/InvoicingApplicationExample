package business.commands;

import javax.inject.Inject;

import domain.invoice.Invoice;
import domain.invoice.InvoiceRepository;

public class ChangeInvoiceDueDateCommand {
    
    private @Inject InvoiceRepository invoiceRepository;
    private @Inject InvoiceDueDateChangeValidator validator;

    public void execute(ChangeInvoiceDueDateRequest request) {
        
        if (validator.isDueDateValid(request.getNewDueDate())) {
            Invoice invoice = invoiceRepository.getByNumber(request.getNumber());
            invoice.changeDueDate(request.getNewDueDate());
            invoiceRepository.save(invoice);
        }
        else {
            throw new InvalidDueDateException();
        }
    }
}
