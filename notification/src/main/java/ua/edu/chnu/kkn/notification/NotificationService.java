package ua.edu.chnu.kkn.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ua.edu.chnu.kkn.event.OrderPlacedEvent;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationService {

    @KafkaListener(topics = "order-placed")
    public void listen(OrderPlacedEvent orderPlacedEvent) {
        log.info("Got Message from order-placed topic {}", orderPlacedEvent);
    }
}
