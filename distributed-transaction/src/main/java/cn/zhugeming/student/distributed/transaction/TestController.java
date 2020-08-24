package cn.zhugeming.student.distributed.transaction;

import cn.zhugeming.student.distributed.transaction.config.MQProducerHolder;
import cn.zhugeming.student.distributed.transaction.constant.MQConstant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孔明
 * @date 2020-08-20 17:51
 * @description cn.zhugeming.student.distributed.transaction.TestController
 */
@RestController
public class TestController {

    @RequestMapping("/sendTest")
    public String sendTest() throws Exception {
        MQProducerHolder.sendMeg(MQConstant.SYNC_PRODUCER, "user-topic", "Hello World !");
        return "SUCCESS";
    }

}
