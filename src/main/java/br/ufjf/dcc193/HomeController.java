package br.ufjf.dcc193;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping({"","index.html"})
    public String home() {
        return "home";
    }

    @RequestMapping("resultado.html")
    public String resultado() {
        return "resultado";
    }
}
