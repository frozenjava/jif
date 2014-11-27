package frozen.data;

/**
 * Created by Josh on 11/27/14.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonConfigs {

    /**
     *
     * @param programConfigPath
     */
    public void readProgramConfig(String programConfigPath) {

        // Var
        File programFolder = new File(programConfigPath);
        File[] programConfigs = programFolder.listFiles();
        // Var


        for (File configFile : programConfigs) {
            try {

                // Read the json file
                FileReader reader = new FileReader(configFile);

                JSONParser jsonParser = new JSONParser();
                JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
