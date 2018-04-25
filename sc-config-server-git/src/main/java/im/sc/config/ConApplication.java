package im.sc.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by lidongri on 2018/4/25.
 */
@EnableConfigServer
@SpringBootApplication
public class ConApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConApplication.class).web(true).run(args);
    }
}
