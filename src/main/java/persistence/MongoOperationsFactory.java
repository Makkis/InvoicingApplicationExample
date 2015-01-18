package persistence;

import java.net.UnknownHostException;

import javax.enterprise.inject.Produces;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

public class MongoOperationsFactory {

    public static final String DB_NAME = "invoicingDB";
    public static final String MONGO_HOST = "localhost";
    public static final int MONGO_PORT = 27017;
    
    @Produces
    public MongoOperations createMongo() {
        try {
            MongoClient mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
            return new MongoTemplate(mongo, DB_NAME);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            throw new Error("DB initialization failed.");
        }
    }
}
