package netology.ru.nginx;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/authorize")
    public String authorize() {
        return "signin";
    }
}
