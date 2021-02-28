// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class Sender {

    public static final String ACCOUNT_SID =
            "AC6dcb92f8ffcc2823056c7cba34f25151";
    public static final String AUTH_TOKEN =
            "afda5bec338d2737bf82fbb7a4471a69";

    public void send(String number) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+1"+number), // to
                        new PhoneNumber("+14693149361"), // from
                        "Greetings!")
                .create();

        //System.out.println(message.getSid());
    }
}