package com.autentia.devtools;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaludoController {

    @RequestMapping("/saludo")
    public String greeting(@RequestParam(value="nombre", required=false, defaultValue="Remote 2SPRING DEV TOOLS...") String name, Model model) {
        model.addAttribute("nombre", name);
        return "saludo";
    }

}
