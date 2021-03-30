package com.github.kylepeng93.controller;

import com.github.kylepeng93.pojo.Employee;
import com.github.kylepeng93.service.RabbitMQSender;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 发送消息
 * https://kylepeng93.github.io
 *
 * @author pengkai
 * @date 2021-03-29 下午10:32
 */
@RestController
@RequestMapping("/javainuse-rabbitmq")
public class RabbitMQWebController {
    @Autowired
    RabbitMQSender rabbitMQSender;

    @GetMapping("/producer")
    public String producer(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {
        Employee employee = new Employee();
        employee.setEmpId(empId);
        employee.setEmpName(empName);
        rabbitMQSender.send(employee);
        return "发送消息成功";
    }

    @PostMapping("/producer2")
    public String porducer2(@RequestBody Employee employee) {
        rabbitMQSender.send(employee);
        return "post消息发送成功" + employee;
    }


}
