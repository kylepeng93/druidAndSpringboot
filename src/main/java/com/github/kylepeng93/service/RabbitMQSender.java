package com.github.kylepeng93.service;

import com.github.kylepeng93.pojo.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * https://kylepeng93.github.io
 *
 * @author pengkai
 * @date 2021-03-29 下午10:33
 */
@Service
public class RabbitMQSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${javainuse.rabbitmq.exchange}")
    private String exchange;

    @Value("${javainuse.rabbitmq.routingkey}")
    private String routingkey;

    public void send(Employee employee) {
        rabbitTemplate.convertAndSend(exchange, routingkey, employee);
        System.out.println("发送消息：" + employee);
    }

}
