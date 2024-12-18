package org.example.dscomputer.mapper;

import org.example.dscomputer.dao.entities.Computer;
import org.example.dscomputer.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper mapper= new ModelMapper();

    public Computer fromComputerDTOToComputer(ComputerDTO computerDto){
        return mapper.map(computerDto, Computer.class);
    }

    public ComputerDTO fromComputerTOComputerDTO(Computer computer){
        return mapper.map(computer, ComputerDTO.class);
    }
}
