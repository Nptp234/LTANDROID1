package MongoDB;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;

import org.bson.Document;

import ClassObject.User;

public class UserWithMongo extends ConnectDB {
    User user;
    MongoCollection<Document> collection;

    public UserWithMongo() {
        collection = database.getCollection("user");
        user = new User();
    }

    public boolean KiemTraNguoiDungDangNhap(String username, String password){
        BasicDBObject query = new BasicDBObject();
        query.put("username", user.get_name());
        query.put("password", user.get_pass());

        // Thực hiện truy vấn và kiểm tra kết quả
        Document result = collection.find(query).first();
        client.close(); // Đóng kết nối đến cơ sở dữ liệu

        // Trả về true nếu dữ liệu tồn tại, ngược lại trả về false
        return result != null;
    }
}
