package com.example.test.Controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.test.Model.Employee;
import com.google.gson.Gson;
 
@RestController
public class KafkaConsumerController  {
 
    @Autowired
    private Gson gson;
 
   @KafkaListener(topics = "test")
    public void getTopics(@RequestBody String emp) {
        System.out.println("Kafka event consumed is: " + emp);
        Employee model = gson.fromJson(emp, Employee.class);
        
        System.out.println("Model converted value: " + model);
//        this.getOrPostTest(model);
        
        
    }
   
   
   public void getOrPostTest(Employee employee) {

	   RestTemplate restTemplate = new RestTemplate();

	   HttpEntity<Employee> request = new HttpEntity<>(employee);
	   restTemplate.postForObject("http://localhost:8080/produce", request, Employee.class);
	 }
   
}


