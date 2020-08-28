package com.termlex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "terms", path="terms")
public interface TermsSource extends JpaRepository<Terms, Integer> {

}
