package boot.consumer.bootconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BootconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootconsumerApplication.class, args);
    }

}
