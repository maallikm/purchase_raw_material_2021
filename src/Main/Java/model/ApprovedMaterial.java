package model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "approved_material")
public class ApprovedMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "material_id")
    private int materialId;

    @Column(name = "material_name")
    private String materialName;

    @Column(name = "approved_date")
    private Date date;

    @Column(name = "web_link_to_approval_case")
    private String webLinkToApprovalCase;

    @Column(name = "comment")
    private String comment;

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWebLinkToApprovalCase() {
        return webLinkToApprovalCase;
    }

    public void setWebLinkToApprovalCase(String webLinkToApprovalCase) {
        this.webLinkToApprovalCase = webLinkToApprovalCase;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ApprovedMaterial{" +
                "materialId=" + materialId +
                ", materialName='" + materialName + '\'' +
                ", date=" + date +
                ", webLinkToApprovalCase='" + webLinkToApprovalCase + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}

