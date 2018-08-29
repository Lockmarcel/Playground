package de.lubowiecki.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author T.Lubowiecki
 */
public class CreateJSON {
    public static void main(String[] args) {
        
        JSONObject json = new JSONObject();
        json.put("name", "Cities");
        
        JSONArray jsonArr = new JSONArray();
        jsonArr.add("Hamburg");
        jsonArr.add("Berlin");
        jsonArr.add("Paris");
        jsonArr.add("London");
        
        json.put("cities", jsonArr);
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("json_data.json"))) {
            bw.write(json.toJSONString());
            bw.flush();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
