package org.library.LibraryAPI.repository;

import org.library.LibraryAPI.domain.Series;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends CrudRepository<Series, Long> {
}
