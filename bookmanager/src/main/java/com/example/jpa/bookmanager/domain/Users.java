package com.example.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Builder
public class Users {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String name;
    @NonNull
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}