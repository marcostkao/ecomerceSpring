package br.com.rd.ecommerce.user.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "ds_first_name")
    private String firstName;

    @NotNull
    @Column(name = "ds_last_name")
    private String lastName;

    @NotNull
    @Column(name = "nr_age")
    private Integer age;

}
