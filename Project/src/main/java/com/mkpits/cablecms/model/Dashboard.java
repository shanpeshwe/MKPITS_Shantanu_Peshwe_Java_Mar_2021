
package com.mkpits.cablecms.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "dashboard")
public class Dashboard implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "false")
    private Integer id;

    @Column(name="thismonthbalance")
    private String thisMonthBalance;

    @Column(name="previousmonthbalance")
    private String previousMonthBalance;

    @Column(name="amountcollected")
    private String amountCollected;

    @Column(name="totalbalance")
    private String totalBalance;

    @Column(name="activeconnections")
    private String activeConnections;

    @Column(name="inactiveconnections")
    private String inactiveConnections;

    @Column(name="month")
    private String month;
}

