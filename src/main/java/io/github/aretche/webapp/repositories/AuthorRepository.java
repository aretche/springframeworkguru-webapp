package io.github.aretche.webapp.repositories;

import io.github.aretche.webapp.model.*;
import org.springframework.data.repository.*;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
