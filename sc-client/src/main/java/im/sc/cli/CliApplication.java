package im.sc.cli;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by lidongri on 2018/4/24.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CliApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(
                CliApplication.class)
                .web(true).run(args);
    }
}
