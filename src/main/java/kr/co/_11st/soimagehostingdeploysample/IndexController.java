package kr.co._11st.soimagehostingdeploysample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = "application/json")
public class IndexController {

    private String version = "1.0.0-SNAPSHOT";

    @GetMapping
    public String getVersion() {
        return version;
    }
}
