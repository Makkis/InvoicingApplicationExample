package persistence;

import java.util.UUID;

import javax.inject.Inject;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import domain.invoice.Invoice;
import domain.invoice.InvoiceRepository;

public class MongoDbInvoiceRepository implements InvoiceRepository {
    
    private @Inject MongoOperations mongo;
    
    @Override
    public Invoice getById(UUID id) {
        return mongo.findById(id, Invoice.class);
    }

    @Override
    public Invoice getByNumber(String invoiceNumber) {
        return mongo.findOne(new Query(Criteria.where("number").is(invoiceNumber)), Invoice.class);
    }

    @Override
    public void save(Invoice invoice) {
        mongo.save(invoice);
    }
}
