package platinum.box.jwt.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Tuan Anh New Bie Dev
 * @version : 1.0 | DemoController
 * @since : 4:05 PM | 4/13/2023
 */

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello From Secured Endpoint ^^");
    }

}
