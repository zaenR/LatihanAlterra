package com.alterra.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="suplier")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Suplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String address;

    @Column(length = 100, unique = true)
    private String email;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.DATE)
    @CreatedDate
    private Date createAt;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @LastModifiedDate
    private Date updateAt;

    @OneToMany(
            mappedBy = "suplier",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Product> product = new ArrayList<>();
}
