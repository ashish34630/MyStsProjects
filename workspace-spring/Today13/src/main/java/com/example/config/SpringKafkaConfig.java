package com.example.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ContainerProperties.AckMode;

@Configuration
@EnableKafka
public class SpringKafkaConfig {
	

	 @Bean
	    public ConcurrentKafkaListenerContainerFactory<String, String> containerFactory() {
	       
	       
	        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<String, String>();
	        factory.setConsumerFactory(new DefaultKafkaConsumerFactory<String, String>(
	        		consumerConfigs()));
	        factory.setConcurrency(10);
	        factory.getContainerProperties().setPollTimeout(3000);
	        factory.getContainerProperties().setAckMode(AckMode.MANUAL_IMMEDIATE);
	        factory.getContainerProperties().setSyncCommits(true);
	        return factory;
	    }
	 
	 
	 	@Bean
	    public Map<String, Object> consumerConfigs() {
	        Map<String, Object> propsMap = new HashMap();
	        propsMap.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
	        propsMap.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	        propsMap.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

	        /*
	        Disabling the auto-commit feature to test the manual commit method.
	         */
//	        propsMap.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);

//	        propsMap.put(ConsumerConfig.GROUP_ID_CONFIG, "gj");
//	        propsMap.put(ConsumerConfig. AUTO_OFFSET_RESET_CONFIG, "earliest");

	        return propsMap;
	    }
	 
	 
}
