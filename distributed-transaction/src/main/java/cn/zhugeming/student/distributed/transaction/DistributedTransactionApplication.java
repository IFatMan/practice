package cn.zhugeming.student.distributed.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableConfigurationProperties
@Import({SpringContextUtil.class})
public class DistributedTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributedTransactionApplication.class, args);
    }

}
