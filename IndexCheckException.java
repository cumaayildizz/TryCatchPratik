public class IndexCheckException extends ArrayIndexOutOfBoundsException{

    public IndexCheckException(String message) {
        super(message);
        System.out.println("Girilen index dizi boyutlari icerisinde degil");
    }

    @Override
    public String toString() {
        return "Array index hatasi";
    }

}
