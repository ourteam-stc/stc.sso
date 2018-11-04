package com.persist.sso.web;

import com.persist.sso.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/{id}/{name}")
    public String index(@PathVariable Integer id,@PathVariable String name){
        //int x = 9/0;
        /*String index = null;
        if(index == null){
            throw new NotFoundException("博客不存在");
        }*/
        System.out.println("-----------index-----------");
        return "index";
    }
}
