package ExamenEntornos.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuardaBaseDatos {

  @RequestMapping("/save")
  public String insercionDatos() {
    return "insercionDatos";
  }
}
