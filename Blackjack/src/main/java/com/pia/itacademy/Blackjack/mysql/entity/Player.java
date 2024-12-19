package com.pia.itacademy.Blackjack.mysql.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(
        name = "player"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Please add the player name")
    private String name;

    public @NotBlank(message = "Please add the player name") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Please add the player name") String name) { this.name = name; }
}
