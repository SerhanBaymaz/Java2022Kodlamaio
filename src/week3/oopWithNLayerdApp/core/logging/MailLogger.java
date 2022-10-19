package week3.oopWithNLayerdApp.core.logging;

public class MailLogger implements ILogger{

    @Override
    public void log(String data) {
        System.out.println("Mail'e log kaydı gönderildi : " + data);
    }
}
