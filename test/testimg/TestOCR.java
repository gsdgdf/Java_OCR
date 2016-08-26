package testimg;
import java.io.File;
import java.io.IOException;
/**
 * Created by zhanghong on 2016/8/26.
 */
public class TestOCR {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //String path = "chi.jpg";
        String path ="D:\\Java_OCR\\Java_OCR\\eurotext.png";
        try {
            String valCode = new OCR_tesseract().recognizeText(new File(path), "png");
            //6905_1294109277pAj9.jpg
            System.out.println(valCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
