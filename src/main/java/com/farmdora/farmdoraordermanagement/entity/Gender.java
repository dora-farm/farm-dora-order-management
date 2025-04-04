package com.farmdora.farmdoraordermanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE(1), FEMALE(2);

    private final int value;
}
