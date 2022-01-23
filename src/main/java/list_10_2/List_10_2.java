package list_10_2;

import list_10_2.message.EncryptedMessage;
import list_10_2.message.TopSecretMessage;

public class List_10_2 {
    public static void main(String[] args) {
        Channel<? extends EncryptedMessage> encryptedMessageChannel = new Channel<TopSecretMessage>();
        Channel<? super TopSecretMessage> topSecretMessageChannel = new Channel<EncryptedMessage>();

        EncryptedMessage encryptedMessage = new EncryptedMessage("encryptedMessage");
        TopSecretMessage topSecretMessage = new TopSecretMessage("topSecredMessage");

        //((Channel<TopSecretMessage>)encryptedMessageChannel).send(topSecretMessage);
        //encryptedMessageChannel.send(topSecretMessage);

        //topSecretMessageChannel.send(encryptedMessage);
    }
}
