package model;

import javax.persistence.*;

@Entity
@Table(name = "purchase_material")
public class PurchaseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "material_id")
    private int materialId;


}
