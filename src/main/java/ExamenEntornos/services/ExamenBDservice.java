package ExamenEntornos.services;

import ExamenEntornos.models.ExamenEntornosmodel;
import ExamenEntornos.repositories.ExamenEntornosRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamenBDservice {

  @Autowired
  ExamenEntornosRepository entornosRepository;

  public ExamenEntornosmodel guardarDatos(ExamenEntornosmodel modeloDatos) {
    return entornosRepository.save(modeloDatos);
  }

  /*devuelve un arrayList del tipo modelo con los datos guardados en la base de datos,
    el método 'findAll' lo provee JPA*/
  public ArrayList<ExamenEntornosmodel> devuelveDatos() {
    return (ArrayList<ExamenEntornosmodel>) entornosRepository.findAll();
  }
}
