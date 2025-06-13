package com.satwik.springboot.service;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.TimeUnit;

public class WikimediaInteractionsHandler implements EventHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(WikimediaInteractionsHandler.class);
    private KafkaTemplate<String, String> kafkaTemplate;
    private String topic;

    public WikimediaInteractionsHandler(KafkaTemplate<String, String> kafkaTemplate, String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    @Override
    public void onOpen() throws Exception {

    }

    @Override
    public void onClosed() throws Exception {

    }

    // need to implement this method
    // this method is triggered with any event from wikimedia
    @Override
    public void onMessage(String s, MessageEvent messageEvent) throws Exception {
        LOGGER.info("event data -> "+messageEvent.getData());
        kafkaTemplate.send(topic, messageEvent.getData());
        TimeUnit.SECONDS.sleep(3);
    }

    @Override
    public void onComment(String s) throws Exception {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
