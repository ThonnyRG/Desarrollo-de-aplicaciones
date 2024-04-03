package uv.coatza.practica1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAplication {
    @RequestMapping("/hello")
    public String Text(){
        return "Python is trash";
    }
    @RequestMapping("/bye")
    public String goodbye(){
        return "End....";
    }
}
