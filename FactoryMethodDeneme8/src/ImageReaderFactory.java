// FACTORY
class ImageReaderFactory {
    public static ImageReader getReader(String type, String imagePath) {
        if ("gif".equalsIgnoreCase(type)) {
            return new GifReader(imagePath);
        } else if ("jpeg".equalsIgnoreCase(type)) {
            return new JpegReader(imagePath);
        }
        return null;
    }
}