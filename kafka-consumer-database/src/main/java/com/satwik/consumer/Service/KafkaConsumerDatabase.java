package com.satwik.consumer.Service;

import com.satwik.consumer.Entity.ConsumerDB;
import com.satwik.consumer.Repository.ConsumerDbInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerDatabase {

    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerDatabase.class);
    @Autowired
    private ConsumerDbInterface consumerRepository;

    @KafkaListener(
            topics = "wikimedia_interactions",
            groupId = "myGroup"
    )
    public void consume(String eventMessage)
    {
        LOGGER.info("Message received -> "+eventMessage);
        ConsumerDB consumerDbInstance = new ConsumerDB();
        consumerDbInstance.setRecentChange(eventMessage);
        ConsumerDB savedObject = consumerRepository.save(consumerDbInstance);
        LOGGER.info("Saved object -> "+savedObject.toString());
    }
}
