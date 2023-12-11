package it.nsis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

/**
 * @author mirco.cennamo on 20/10/2023
 * @project spring-boot-kafka-producer
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rilevazione implements Serializable {
    private static final long serialVersionUID = 1L;
    private UUID uuid;
    private String licensePlate;

    private String latitude;
    private String longitude;

    private boolean found;

    private Date insertAt;
    private Date updateAt;






}
