
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONParser {
    public static Data parseJSON(String jsonData) {
        Gson gson = new Gson();
        return gson.fromJson(jsonData, Data.class);
    }
}

