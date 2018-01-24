package th.in.lordgift.springmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import th.in.lordgift.springmvc.controller.pojo.Person;

import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/testBody", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Person testBody(Person body) {

        System.out.println("********************** test **********************");
        System.out.println(body.getNickname());

        return new Person("ไอ้", "สาส");
    }

    @RequestMapping(value = "/getUrl", method = RequestMethod.GET)
    public String testTemplate(Map<String, Object> model) {
        return "test";
    }

}
