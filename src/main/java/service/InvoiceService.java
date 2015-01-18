package service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import business.commands.ChangeInvoiceDueDateCommand;
import business.commands.ChangeInvoiceDueDateRequest;

@WebService(serviceName="InvoiceWS")
public class InvoiceService {
    
    private @Inject ChangeInvoiceDueDateCommand changeInvoiceDueDate;
    
    @WebMethod
    public void changeInvoiceDuedate(String invoiceNumber, Date newDueDate) {
        ChangeInvoiceDueDateRequest request = new ChangeInvoiceDueDateRequest(invoiceNumber, ZonedDateTime.ofInstant(newDueDate.toInstant(), ZoneId.systemDefault()).toLocalDate());
        changeInvoiceDueDate.execute(request);
    }
}
