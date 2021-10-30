package com.mkpits.cablecms.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customerid")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "false")
    private Integer customerId;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name="phoneno")
    private String phoneNo;

    @Column(name="address")
    private String address;

    @Column(name="email")
    private String email;

    @Column(name="packageamount")
    private String packageAmount;

    @Column(name="area")
    private String area;

    @Column(name="balance")
    private String balance;

    @Column(name = "setupboxno")
    private String setupBoxNo;

    @Column(name="status")
    private String status;
}
