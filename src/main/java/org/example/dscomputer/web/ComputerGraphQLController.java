package org.example.dscomputer.web;

import org.example.dscomputer.dto.ComputerDTO;
import org.example.dscomputer.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class ComputerGraphQLController {

    private ComputerService computerService ;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computer){
        return computerService.saveComputer(computer);
    }

    @QueryMapping
    public ComputerDTO getComputerByProce(@Argument String proce){
        return computerService.getComputerByProce(proce);
    }


}
