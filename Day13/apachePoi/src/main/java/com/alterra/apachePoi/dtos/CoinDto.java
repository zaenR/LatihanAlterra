package com.alterra.apachePoi.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class CoinDto implements Serializable {
    private Long id;
    private String name;
    private int coinId;
    private String code;
    private String exchange;
    private int invalid;
    private Long recordTime;
    private BigDecimal usd;
    private BigDecimal idr;
    private int hnst;
    private BigDecimal btc;

    private Date createAt;

    private Date updateAt;
}
