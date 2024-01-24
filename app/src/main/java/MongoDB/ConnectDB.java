package MongoDB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public abstract class ConnectDB {
    MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/android_test1");
    MongoClient client = new MongoClient(uri);
    MongoDatabase database = client.getDatabase("android_test1");
}
