package im.sc.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lidongri on 2018/4/25.
 */
@FeignClient("eureka-client1")
public interface HomeClient {

    @GetMapping("/home")
    String consumer();
}
