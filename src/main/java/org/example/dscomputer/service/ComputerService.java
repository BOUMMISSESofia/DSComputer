package org.example.dscomputer.service;

import org.example.dscomputer.dao.entities.Computer;
import org.example.dscomputer.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {

    public ComputerDTO getComputerByProce(String proce);
    public ComputerDTO saveComputer(ComputerDTO computerDto);
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDtos);
}
