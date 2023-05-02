package org.example.models;

import liquibase.pro.packaged.A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "taro_card_table")
public class TaroEntity{

    @Column
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;
    @Column
    private String dignity;
    @Column
    private String description;
    @Column
    private String lasso;

    @Column(nullable = true)
    private String suit;
    @Column(nullable = true)
    private String name;



}
