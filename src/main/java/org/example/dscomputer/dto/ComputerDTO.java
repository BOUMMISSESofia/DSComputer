package org.example.dscomputer.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ComputerDTO {
    String proce;
    String ram;
    String hardDrive;
    String price;
    String macAddress;
}
