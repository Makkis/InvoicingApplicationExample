package persistence;

import java.util.UUID;

import javax.inject.Inject;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import business.api.InvoiceDto;
import domain.invoice.InvoiceAdapter;

public class MongoDbInvoiceAdapter implements InvoiceAdapter {
    
    private @Inject MongoOperations mongo;
    
    @Inject
    public MongoDbInvoiceAdapter(MongoOperations mongo) {
        this.mongo = mongo; 
    }

    @Override
    public InvoiceDto getById(UUID id) {
        return mongo.findById(id, InvoiceDto.class);
    }

    @Override
    public InvoiceDto getByNumber(String invoiceNumber) {
        return mongo.findOne(new Query(Criteria.where("number").is(invoiceNumber)), InvoiceDto.class);
    }

    @Override
    public void save(InvoiceDto invoiceDto) {
        mongo.save(invoiceDto);
    }
}
