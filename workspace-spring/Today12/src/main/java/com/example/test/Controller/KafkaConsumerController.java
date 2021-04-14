package com.example.test.Controller;
 
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Controller;

import com.example.test.Model.Employee;
import com.google.gson.Gson;
 
@Controller
public class KafkaConsumerController  {
 
    @Autowired
    private Gson gson;
 
    @KafkaListener(id = "receiver-api",         
            topicPartitions =
            { @TopicPartition(topic = "mest", 
                    partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0"))
                    })
//    @KafkaListener(topics = "mest")
    public void getTopics(ConsumerRecord<?, ?> consumerRecord,Acknowledgment acknowledgment) {
        System.out.println("Kafka event consumed is: " + consumerRecord.value());
        Employee model = gson.fromJson((String) consumerRecord.value(), Employee.class);
        System.out.println("Model converted value: " + model);
        System.out.println(consumerRecord.partition());
        System.out.println(consumerRecord.offset());
        
        acknowledgment.acknowledge();
       
    }
}