package org.example.dscomputer.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Computer{
    @Id
    @GeneratedValue
    Long id;
    String proce;
    String ram;
    String hardDrive;
    String price;
    String macAdress;
}
