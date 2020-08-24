package cn.zhugeming.student.distributed.transaction.config;

import cn.zhugeming.student.distributed.transaction.constant.MQConstant;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 孔明
 * @date 2020-08-20 17:37
 * @description cn.zhugeming.student.distributed.transaction.config.RocketMQProducer
 */
@Configuration
@Import(RocketMQProductConfig.class)
class RocketMQProducer {

    @Autowired
    private RocketMQProductConfig productConfig;

    @Bean(MQConstant.SYNC_PRODUCER)
    public DefaultMQProducer syncProducer() throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer(productConfig.getProducerGroupName());
        producer.setNamesrvAddr(productConfig.getNamesrvAddr());
        producer.setInstanceName(productConfig.getProducerInstanceName());
        producer.setVipChannelEnabled(false);
        producer.setRetryTimesWhenSendAsyncFailed(10);
        producer.start();
        return producer;
    }

}
