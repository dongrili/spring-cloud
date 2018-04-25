package im.sc.consumer.controller;

import im.sc.consumer.client.HomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lidongri on 2018/4/24.
 */
@RestController
public class ConController {

    @Autowired
   HomeClient homeClient;

    @GetMapping("/consumer")
    public String dc() {
        try {

            String t = homeClient.consumer();

            System.out.println(t);
            return t;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
