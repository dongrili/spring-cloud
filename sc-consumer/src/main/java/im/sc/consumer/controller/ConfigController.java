package im.sc.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lidongri on 2018/4/25.
 */

@RestController
public class ConfigController {

    @Value("${info.password}")
    private String username;


    @RequestMapping("/config")
    public String config(){
        return username;
    }
}
