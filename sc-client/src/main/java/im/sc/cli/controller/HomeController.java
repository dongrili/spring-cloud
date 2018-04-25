package im.sc.cli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lidongri on 2018/4/24.
 */
@RestController
public class HomeController {


    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/home")
    public String home() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
