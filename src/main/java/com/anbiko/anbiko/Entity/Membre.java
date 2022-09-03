package com.anbiko.anbiko.Entity;

import com.anbiko.anbiko.enums.Sexe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Membre {
    @Id
    @SequenceGenerator(name = "membre_id", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long membre_id;
    @Column(length = 40)
    private String nom;
    @Column(length = 40)
    private String prenom;

    @Column(length = 50)
    private String commune;
    @Column(length = 10)
    private String telephone;
    @Column(length = 10)
    private String ville;

}
