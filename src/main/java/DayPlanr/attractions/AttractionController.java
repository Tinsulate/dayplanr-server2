package DayPlanr.attractions;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class AttractionController {

    @RequestMapping("/helsinki")
    @ResponseBody
    String attractions() {
        //TODO: Rakenna POJO-malli, jonka voi testivaiheessa populoida jacksonilla http://wiki.fasterxml.com/JacksonInFiveMinutes#Full_Data_Binding_.28POJO.29_Example
        return "Hello World!";
    }

}
