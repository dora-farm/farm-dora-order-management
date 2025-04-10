package com.farmdora.farmdoraordermanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Auth {

    @Id
    @Column(name = "auth_id")
    private Short id;

    @Column(nullable = false, length = 50)
    private String role;
}
