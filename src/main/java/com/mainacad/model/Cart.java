package com.mainacad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "carts")
public class Cart {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "creation_time")
    private Long creationTime;

    @Column(name = "closed")
    private Boolean closed;

    @ManyToOne(targetEntity = User.class)
    private User user;

    public Cart(Long creationTime, Boolean closed, User user) {
        this.creationTime = creationTime;
        this.closed = closed;
        this.user = user;
    }
}