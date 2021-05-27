package model;


import javax.persistence.*;

@Entity
@Table(name = "material_group")
public class MaterialGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "material_id")
    private int materialId;

    @Column(name = "material_group")
    private String materialGroup;

    @Column(name= "comment")
    private String comment;

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getMaterialGroup() {
        return materialGroup;
    }

    public void setMaterialGroup(String materialGroup) {
        this.materialGroup = materialGroup;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "MaterialGroup{" +
                "materialId=" + materialId +
                ", materialGroup='" + materialGroup + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
