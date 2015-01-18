package business.api;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class InvoiceDto {

    @Id
    public UUID id;
    public String number;
    public LocalDate dueDate;

    public InvoiceDto(UUID id, String number, LocalDate dueDate) {
        this.id = id;
        this.number = number;
        this.dueDate = dueDate;
    }
    
    public UUID getId() {
        return id;
    }
    public String getNumber() {
        return number;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
}
