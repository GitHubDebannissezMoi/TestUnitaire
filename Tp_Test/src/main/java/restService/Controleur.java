package restService;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controleur {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @PostMapping("/users/{Userid}/todos")
    String toDo(@PathVariable Integer Userid) {
        return "Todo " + Userid;
    }

    @PostMapping("/users/{Userid}/todos/items")
    String items(@PathVariable Integer Userid) {
        return "items "+ Userid;
    }

    @GetMapping("/users/{Userid}/todos/items")
    String getItems(@PathVariable Integer Userid) {
        return "items obtenus " + Userid;
    }
}
