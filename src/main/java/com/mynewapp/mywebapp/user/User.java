package com.mynewapp.mywebapp.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 45)
    private String email;
    @Column(nullable = false, length = 15)
    private String password;
    @Column(nullable = false, length = 45, name = "firs_name")
    private String firstname;
    @Column(nullable = false, length = 45, name = "last_name")
    private String lastname;

}
