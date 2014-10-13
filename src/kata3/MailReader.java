/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Line;

/**
 *
 * @author usuario
 */
public class MailReader {
    private final String filePath;

    public MailReader (String filePath){
        this.filePath=filePath;
    }
    
    public String[] readDomains() throws IOException{
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                ArrayList<String> domainList = new ArrayList<>();
                while(true){
                    String line= reader.readLine();
                    if(line==null) break;
                    if(line.contains("@")){
                        domainList.add(line.split("@")[1]);
                    }
                }
                reader.close();
                return domainList.toArray(new String[domainList.size()]);
            }
        } catch (IOException ex) {
            Logger.getLogger(MailReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new String[0];
    }
}

