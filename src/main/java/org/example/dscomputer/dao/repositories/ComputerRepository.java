package org.example.dscomputer.dao.repositories;

import org.example.dscomputer.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

    public Computer findByProce(String proce);
}
