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
@Table(name = "admin")
public class Admin implements Serializable {
    @Id
    @Column(name = "adminid")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "false")
    private Integer adminId;

    @Column(name="companyname")
    private String companyName;

    @Column(name = "username")
    private String userName;

    @Column(name = "emailaddress")
    private String emailAddress;

    @Column(name = "contactnumber")
    private String contactNumber;

    @Column(name = "password")
    private String password;
}
