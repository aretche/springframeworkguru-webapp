package io.github.aretche.webapp.repositories;

import io.github.aretche.webapp.model.*;
import org.springframework.data.repository.*;

public interface BookRepository extends CrudRepository<Book, Long> {
}
