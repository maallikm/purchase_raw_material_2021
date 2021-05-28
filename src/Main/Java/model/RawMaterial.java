package model;


import javax.persistence.*;

@Entity
@Table(name = "raw_material")
public class RawMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "material_id")
    private int materialId;

    @Column(name = "material_group")
    private String materialGroup;

    @Column(name = "material_name")
    private String materialName;

    @Column(name = "producer")
    private String producer;

    @Column(name = "melt_index")
    private String meltIndex;

    @Column(name = "density")
    private String density;

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

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMeltIndex() {
        return meltIndex;
    }

    public void setMeltIndex(String meltIndex) {
        this.meltIndex = meltIndex;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "RawMaterial{" +
                "materialId=" + materialId +
                ", materialGroup='" + materialGroup + '\'' +
                ", materialName='" + materialName + '\'' +
                ", producer='" + producer + '\'' +
                ", meltIndex='" + meltIndex + '\'' +
                ", density='" + density + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
