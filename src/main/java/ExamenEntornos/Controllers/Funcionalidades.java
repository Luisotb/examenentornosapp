package ExamenEntornos.Controllers;

import ExamenEntornos.models.ExamenEntornosmodel;
import ExamenEntornos.services.ExamenBDservice;
import ExamenEntornos.services.mostrarVocales;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Funcionalidades {

  @Autowired
  @GetMapping("/")
  public String explicacion() {
    return (
      "Estas son todas las funciones que puedes realizar:" +
      "<br>" +
      "<br>" +
      "- Para contar las vocales y consonantes de una palabra, escribe: /extraer/{palabra}" +
      "<br>" +
      "<br>" +
      "- Para guardar datos en la base de datos, escribe: '/insertaDatos'" +
      "<br>" +
      "<br>" +
      "- Para listar los datos de la base, escribe: '/view'"
    );
  }

  @Autowired
  ExamenBDservice ExamenBDservice;

  @PostMapping("/save")
  public String insertaDatos(@RequestParam Map<String, String> body) {
    System.out.println(body.get("dato"));
    ExamenEntornosmodel entornosModel = new ExamenEntornosmodel();
    entornosModel.setDato(body.get("dato"));
    ExamenBDservice.guardarDatos(entornosModel);
    return "Dato guardado correctamente.";
  }

  @GetMapping("/view")
  public String listarDatos() {
    return ExamenBDservice.devuelveDatos().toString();
  }

  @GetMapping("/extraer/{palabra}")
  public String mostradorVocales(@PathVariable String palabra) {
    String vocales = mostrarVocales.mostrador(palabra);
    return (
      "- La frase original es: " +
      palabra +
      "<br>" +
      "<br>" +
      "- Las vocales son: " +
      vocales
    );
  }
}
