package com.satwik.consumer.Repository;

import com.satwik.consumer.Entity.ConsumerDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerDbInterface extends JpaRepository<ConsumerDB, Long> {
    // SimpleJpaRepository (class or implementation class) implements JpaSRepositoryImplementation
    // JpaSRepositoryImplementation extends JpaRepository
    // JpaRepository extends PagingAndSortingRepository
    // PagingAndSortingRepository extends CrudRepository
    // CrudRepository extends Repository

    // you can add custom query methods if needed, this is optional
}
