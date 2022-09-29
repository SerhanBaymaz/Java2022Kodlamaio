package week1;

public class SesliHarfler {
    public static void main(String[] args) {
        char harf = 'A';

        switch(harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Seçtiğiniz harf : Kalın sesli harf");
                break;
            default:
                System.out.println("Seçtiğiniz harf : İnce sesli harf");
        }
    }
}
