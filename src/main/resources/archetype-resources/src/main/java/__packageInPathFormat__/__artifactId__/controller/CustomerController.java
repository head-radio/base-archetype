package ${package}.${artifactId}.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static ${package}.${artifactId}.util.WebURLSUtil.*;

@RestController
@RequestMapping(CUSTOMER_BASE_PATH)
public class CustomerController {

    @PostMapping
    public ResponseEntity<String> createCustomer() {
        return ResponseEntity.ok("ok");
    }

    @GetMapping(value = CUSTOMER_PATH_PARAM)
    public ResponseEntity<String> getCustomer(@PathVariable(CUSTOMER_ID) String input) {
        return ResponseEntity.ok("ok");
    }

}