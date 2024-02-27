package main.java.shoppingcarts.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @Column(name = "name_user",unique = true)
    private String nameUser;
    @Column(name = "limit_card")
    private double limitCard;

    public User(String nameUser, double limitCard) {
        this.nameUser = nameUser;
        this.limitCard = limitCard;
    }
}
