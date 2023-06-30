package com.globant.challenge.openpay.apihistoric.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Represent records table
 *
 * @author luis.delcampo
 */
@Entity
@Table(name = "records")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class RecordEntity implements Serializable {

    /**
     * The id for records table.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of resource.
     */
    private String resource;

    /**
     * The timestamp.
     *
     * TODO Change to Date
     */
    private String timestamp;

}
