package com.YasserAet.clientmanagement.persistence;

import com.YasserAet.clientmanagement.domain.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing client data.
 *
 * <p>
 * Inherits standard CRUD methods from JpaRepository and can be extended
 * with custom queries. Uses Spring Data JPA for automatic implementation
 * generation.
 * </p>
 *
 * @author AITALI YASSIR
 * @version 1.0.0
 * @since 2025-12-29
 * @see ClientEntity
 * @see JpaRepository
 */
@Repository
public interface ClientDataRepository extends JpaRepository<ClientEntity, Long> {

    // Standard CRUD methods are automatically provided by JpaRepository
}
