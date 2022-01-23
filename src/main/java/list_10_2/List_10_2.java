package list_10_2;

import list_10_2.message.EncryptedMessage;
import list_10_2.message.TopSecretMessage;

public class List_10_2 {
    public static void main(String[] args) {
        Channel<? extends EncryptedMessage> encryptedMessageChannel = new Channel<TopSecretMessage>();
        Channel<? super TopSecretMessage> topSecretMessageChannel = new Channel<EncryptedMessage>();

        Channel<? extends  TopSecretMessage> topSecretMessageChannel2 = new Channel<>();



        EncryptedMessage encryptedMessage = new EncryptedMessage("encryptedMessage");
        TopSecretMessage topSecretMessage = new TopSecretMessage("topSecredMessage");

        //topSecretMessageChannel2.send(encryptedMessage);

        //encryptedMessageChannel.send(topSecretMessage);
        //topSecretMessageChannel.send(encryptedMessage);
    }
}
