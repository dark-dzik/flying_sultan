package list_10_2;

import list_10_2.message.PlainTextMessage;
import list_10_2.message.TopSecretMessage;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

@Slf4j
public class Channel <T> {

    private Queue<? super T> messagesQueue;

    public Channel() {
        messagesQueue = new LinkedList<>();
    }

    public void send(T message) {
        messagesQueue.add(message);
        log.info("Sending: {}", message);
    }

    public void receive() {
        var message = messagesQueue.poll();

        if(Objects.nonNull(message)) {
            log.info("Receiving: {}", message);
        } else {
            log.info("Channel is empty.");
        }
    }
}
