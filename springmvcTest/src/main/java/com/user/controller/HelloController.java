package com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/hello/sayHello")
    public String sayHello() {
        System.out.println("HelloController的sayHello方法执行了。。。");
        return "success";
    }

    @RequestMapping("/user/register")
    public String getpara(@RequestParam Map map) {
        System.out.println("获取到的请求参数：" + map);
        return "success";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/{mealId}/{groupId}/{itemId}")
    public String findCheckItem(@PathVariable("mealId") int mealId, @PathVariable("groupId") int groupId, @PathVariable("itemId") int itemId){
        System.out.println("根据id查询:mealId=" + mealId + ",groupId=" + groupId + ",itemId=" + itemId);
        return "success";
    }

    @RequestMapping(method = RequestMethod.DELETE,path = "/{mealId}/{groupId}/{itemId}")
    public String deleteCheckItem(@PathVariable("mealId") int mealId,@PathVariable("groupId") int groupId,@PathVariable("itemId") int itemId){
        System.out.println("根据id删除:mealId=" + mealId + ",groupId=" + groupId + ",itemId=" + itemId);

        return "success";
    }
}
