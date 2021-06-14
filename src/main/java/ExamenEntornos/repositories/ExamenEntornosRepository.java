package ExamenEntornos.repositories;

import ExamenEntornos.models.ExamenEntornosmodel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenEntornosRepository
  extends CrudRepository<ExamenEntornosmodel, Long> {}
