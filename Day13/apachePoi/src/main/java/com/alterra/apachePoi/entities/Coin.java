package com.alterra.apachePoi.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "coins")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Coin {
    @Id
    private Long id;
    private String name;
    private String ticker;
    private int coinId;
    private String code;
    private String exchange;
    private int invalid;
    private Long recordTime;
    private Long usd;
    private Long idr;
    private int hnst;
    private Long eth;
    private Long btc;

    @Column(nullable = false,updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updateAt;

}
