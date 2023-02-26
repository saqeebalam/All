
package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Role;

public interface RoleRepositories extends JpaRepository<Role, Long> {

}
