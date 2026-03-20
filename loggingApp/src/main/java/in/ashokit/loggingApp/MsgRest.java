package in.ashokit.loggingApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRest {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/msg")
    public String getMsg(){
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        return "success";
    }

}
