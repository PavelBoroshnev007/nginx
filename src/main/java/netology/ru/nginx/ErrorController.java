package netology.ru.nginx;
import org.springframework.stereotype.Controller;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.server.ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error/404"));
    }

    @RequestMapping("/error/404")
    public String handleNotFound() {
        return "error/404";  // Имя файла HTML для обработки ошибки 404
    }
}
