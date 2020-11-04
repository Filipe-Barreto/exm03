package br.ufjf.dcc193;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
    @RequestMapping({"","index.html"})
    public String home() {
        return "home";
    }

    @RequestMapping("resultado.html")
    public ModelAndView resultado(Retangulo r) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("resultado");
        mv.addObject("retangulo", r);
        return mv;
    }
}
