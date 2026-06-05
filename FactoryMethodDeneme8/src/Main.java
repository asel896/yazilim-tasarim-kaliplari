// İSTEMCİ (MAIN)
public class Main {
    public static void main(String[] args) {

        ImageReader reader = null;
        String image1 = "jpeg";

        if (image1.equals("gif")) {
            reader = new GifReader(image1);
        } else if (image1.equals("jpeg")) {
            reader = new JpegReader(image1);
        }

        if (reader != null) {
            DecodedImage decodedImage = reader.getDecodeImage();
            System.out.println(decodedImage); // Çıktı: jpeg: is decoded
        }
    }
}