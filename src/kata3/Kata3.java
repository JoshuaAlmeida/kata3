/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.io.IOException;

/**
 *
 * @author usuario
 */
public class Kata3 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MailReader mailReader = new MailReader("mails.txt");
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        Histogram<String> histogram=builder.build(mailReader.readDomains());
        new HistogramViewer().print(histogram);
    }
}
