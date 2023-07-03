package com.example.login.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Data
@Table(name="login")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @Column
    @GeneratedValue
    private Long userId;
    @Column
    private String userName;
    @Column
    private String userPassword;
    @Column
    private LocalDate birth;





}
