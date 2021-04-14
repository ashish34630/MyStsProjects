package com.example.test.Controller;
 
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Model.Employee;
import com.google.gson.Gson;
 
@RestController
public class KafkaConsumerController {
 
    @Autowired
    private Gson gson;
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
 
    @KafkaListener(topics = { "test" })
    public void getTopics(@RequestBody String emp) {
        System.out.println("Kafka event consumed is: " + emp);
        Employee model = gson.fromJson(emp, Employee.class);
        System.out.println("Model converted value: " + model);
    }
    
    @PostMapping("/produce")
    public ResponseEntity<String> postModelToKafka(@RequestBody Employee emp)
            throws InterruptedException, ExecutionException {
        ListenableFuture<SendResult<String, String>> result = kafkaTemplate.send("test", gson.toJson(emp));
        return new ResponseEntity<>(result.get().getProducerRecord().value(), HttpStatus.OK);
    }
}