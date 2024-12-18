package org.example.dscomputer.service;

import org.example.dscomputer.dao.entities.Computer;
import org.example.dscomputer.dao.repositories.ComputerRepository;
import org.example.dscomputer.dto.ComputerDTO;
import org.example.dscomputer.mapper.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerManager implements ComputerService {

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    public ComputerManager(ComputerRepository computerRepository, ComputerMapper computerMapper) {
        this.computerRepository = computerRepository;
        this.computerMapper = computerMapper;
    }

    @Override
    public ComputerDTO getComputerByProce(String proce) {
        Computer computer = computerRepository.findByProce(proce);
        return computerMapper.fromComputerTOComputerDTO(computer);
    }

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDto) {
        Computer computer = computerMapper.fromComputerDTOToComputer(computerDto);
        computer = computerRepository.save(computer);
        return computerMapper.fromComputerTOComputerDTO(computer);
    }

    @Override
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDtos) {
        List<ComputerDTO> computers = new ArrayList<>();
        for (ComputerDTO computerDto : computerDtos) {
            computers.add(saveComputer(computerDto));
        }
        return computers;
    }
}


