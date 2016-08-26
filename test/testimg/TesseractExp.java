package testimg;
import java.io.File;
import net.sourceforge.tess4j.*;

/**
 * Created by zhanghong on 2016/8/26.
 */
public class TesseractExp {
    public static void main(String[] args) {
      //  File imageFile = new File("eurotext.tif");
        File imageFile = new File("chi.jpg");
        File imageFile1 = new File("chi1.jpg");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile1);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
