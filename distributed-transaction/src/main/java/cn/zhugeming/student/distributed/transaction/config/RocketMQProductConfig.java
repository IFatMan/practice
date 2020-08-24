package cn.zhugeming.student.distributed.transaction.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 孔明
 * @date 2020-08-20 17:22
 * @description cn.zhugeming.student.distributed.transaction.config.RocketMQProductConfig
 */

@PropertySource("classpath:rocketmq-product.properties")
@ConfigurationProperties(prefix = "spring.rocketmq")
public class RocketMQProductConfig {

    /**
     * 指定namesrv地址
     */
    private String namesrvAddr;

    /**
     * 生产者group名称
     */
    private String producerGroupName;

    /**
     * 事务生产者group名称
     */
    private String transactionProducerGroupName;

    /**
     * 消费者group名称
     */
    private String consumerGroupName;

    /**
     * 生产者实例名称
     */
    private String producerInstanceName;

    /**
     * 消费者实例名称
     */
    private String consumerInstanceName;

    /**
     * 事务生产者实例名称
     */
    private String producerTranInstanceName;

    /**
     * 一次最大消费多少数量消息
     */
    private int consumerBatchMaxSize;

    /**
     * 广播消费
     */
    private boolean consumerBroadcasting;

    /**
     * 启动的时候是否消费历史记录
     */
    private boolean enableHistoryConsumer;

    /**
     * 启动顺序消费
     */
    private boolean enableOrderConsumer;

    /**
     * 消费的topic：tag
     */
    private List<String> subscribe = new ArrayList<String>();

    public String getNamesrvAddr() {
        return namesrvAddr;
    }

    public void setNamesrvAddr(String namesrvAddr) {
        this.namesrvAddr = namesrvAddr;
    }

    public String getProducerGroupName() {
        return producerGroupName;
    }

    public void setProducerGroupName(String producerGroupName) {
        this.producerGroupName = producerGroupName;
    }

    public String getTransactionProducerGroupName() {
        return transactionProducerGroupName;
    }

    public void setTransactionProducerGroupName(String transactionProducerGroupName) {
        this.transactionProducerGroupName = transactionProducerGroupName;
    }

    public String getConsumerGroupName() {
        return consumerGroupName;
    }

    public void setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
    }

    public String getProducerInstanceName() {
        return producerInstanceName;
    }

    public void setProducerInstanceName(String producerInstanceName) {
        this.producerInstanceName = producerInstanceName;
    }

    public String getConsumerInstanceName() {
        return consumerInstanceName;
    }

    public void setConsumerInstanceName(String consumerInstanceName) {
        this.consumerInstanceName = consumerInstanceName;
    }

    public String getProducerTranInstanceName() {
        return producerTranInstanceName;
    }

    public void setProducerTranInstanceName(String producerTranInstanceName) {
        this.producerTranInstanceName = producerTranInstanceName;
    }

    public int getConsumerBatchMaxSize() {
        return consumerBatchMaxSize;
    }

    public void setConsumerBatchMaxSize(int consumerBatchMaxSize) {
        this.consumerBatchMaxSize = consumerBatchMaxSize;
    }

    public boolean isConsumerBroadcasting() {
        return consumerBroadcasting;
    }

    public void setConsumerBroadcasting(boolean consumerBroadcasting) {
        this.consumerBroadcasting = consumerBroadcasting;
    }

    public boolean isEnableHistoryConsumer() {
        return enableHistoryConsumer;
    }

    public void setEnableHistoryConsumer(boolean enableHistoryConsumer) {
        this.enableHistoryConsumer = enableHistoryConsumer;
    }

    public boolean isEnableOrderConsumer() {
        return enableOrderConsumer;
    }

    public void setEnableOrderConsumer(boolean enableOrderConsumer) {
        this.enableOrderConsumer = enableOrderConsumer;
    }

    public List<String> getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(List<String> subscribe) {
        this.subscribe = subscribe;
    }
}
