package gcumsa.domain;

import gcumsa.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "hellos", path = "hellos")
public interface HelloRepository
    extends PagingAndSortingRepository<Hello, Long> {}
