package dylan.oao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Vitamin L(贾渊博)
 * @date 2020/2/10 21:39
 * 预测未来最好的方法就是去创造未来
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/method",method = RequestMethod.GET)
    public String getView(){
        return "test";
    }
}
