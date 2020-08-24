package cn.zhugeming.student.distributed.transaction.config;

import cn.hutool.log.LogFactory;
import cn.zhugeming.student.distributed.transaction.SpringContextUtil;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

import java.nio.charset.Charset;
import java.util.Objects;

/**
 * @author 孔明
 * @date 2020-08-20 17:42
 * @description cn.zhugeming.student.distributed.transaction.config.MQProducerHolder
 */
public class MQProducerHolder {


    public static void sendMeg(final String producerName, final String topic, final String msg) throws Exception {
        DefaultMQProducer producer = (DefaultMQProducer) SpringContextUtil.getBean(producerName);
        if (Objects.isNull(producer)) {
            throw new IllegalArgumentException();
        }

        Message message = new Message(topic, msg.getBytes(Charset.forName("UTF-8")));
        message.setKeys("1");
        SendResult sendResult = producer.send(message);
        LogFactory.get().info("{} - {} : {}", producer, topic, sendResult.toString());
    }

}
