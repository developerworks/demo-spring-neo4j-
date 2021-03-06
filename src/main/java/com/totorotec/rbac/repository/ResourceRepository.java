package com.totorotec.rbac.repository;

import com.totorotec.rbac.entity.Resource;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path = "/resources")
public interface ResourceRepository extends Neo4jRepository<Resource, Long> {
    Optional<Resource> findByUuid(String id);
}
