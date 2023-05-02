package org.example.models;

import liquibase.pro.packaged.A;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "taro_card_table")
public class TaroEntity{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String dignity;
    @Column
    private String description;
    @Column(name = "lasso")
    private String lasso;

    @Column(nullable = true)
    private String suit;
    @Column(nullable = true)
    private String name;
}
