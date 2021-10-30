package com.mkpits.cablecms.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@Table(name = "area")
public class Area {
    @Id
    @Column(name = "areaid")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "false")
    private Integer areaId;

    @Column(name="areaname")
    private String areaName;

}
