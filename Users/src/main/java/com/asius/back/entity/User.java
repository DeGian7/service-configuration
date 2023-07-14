package com.asius.back.entity;



import lombok.Data;


import javax.persistence.*;


@Entity
@Table (name = "usuario")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusurios;
    private String username;
    private String password;
    private String img;
    private String nombuser;
    private String apelliuser;
    private String emailuser;
    private String telefuser;
    private String perfiluser;

    public User(){

    }


}
