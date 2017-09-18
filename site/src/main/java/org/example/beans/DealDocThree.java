package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onehippo.cms7.essentials.components.rest.adapters.HippoGalleryImageAdapter;
import org.hippoecm.hst.content.beans.ContentNodeBindingException;
import javax.jcr.RepositoryException;
import java.util.Calendar;

@XmlRootElement(name = "dealdocthree")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "myhippoproject:DealDocThree")
@Node(jcrType = "myhippoproject:DealDocThree")
public class DealDocThree extends BaseDocument {
    private String company;
    private String website;
    private String location;
    private String industry;
    private String description;
    private Long founded;
    private Long employees;
    private Double raising;
    private Double per;
    private Double annualRevenue;
    private Double prevCapital;
    private String type;
    private HippoGalleryImageSet imageBean;

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:company")
    public String getCompany() {
        return getProperty("myhippoproject:company");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:website")
    public String getWebsite() {
        return getProperty("myhippoproject:website");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:location")
    public String getLocation() {
        return getProperty("myhippoproject:location");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:industry")
    public String getIndustry() {
        return getProperty("myhippoproject:industry");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:founded")
    public Long getFounded() {
        return getProperty("myhippoproject:founded");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:employees")
    public Long getEmployees() {
        return getProperty("myhippoproject:employees");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:raising")
    public Double getRaising() {
        return getProperty("myhippoproject:raising");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:dilution")
    public Double getPer() {
        return getProperty("myhippoproject:per");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:annualRevenue")
    public Double getAnnualRevenue() {
        return getProperty("myhippoproject:annualRevenue");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:prevCapital")
    public Double getPrevCapital() {
        return getProperty("myhippoproject:prevCapital");
    }

 @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:prevCapital")
    public Double getType() {
        return getProperty("myhippoproject:type");
    }
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:description")
    public String getDescription() {
        return getProperty("myhippoproject:description");
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:image")
    public HippoGalleryImageSet getImage() {
        return getLinkedBean("myhippoproject:image", HippoGalleryImageSet.class);
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFounded(Long founded) {
        this.founded = founded;
    }

    public void setEmployees(Long employees) {
        this.employees = employees;
    }

    public void setRaising(Double raising) {
        this.raising = raising;
    }

    public void setPer(Double per) {
        this.per = per;
    }

    public void setAnnualRevenue(Double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public void setPrevCapital(Double prevCapital) {
        this.prevCapital = prevCapital;
    }

    public void setImage(HippoGalleryImageSet imageBean) {
        this.imageBean = imageBean;
    }
     public void setType(String type) {
        this.type = type;
    }

    public boolean bind(Object content, javax.jcr.Node node)
            throws ContentNodeBindingException {
        try {
            DealDocThree dealDocThreeBean = (DealDocThree) content;
            node.setProperty("myhippoproject:company",
                    dealDocThreeBean.getCompany());
            node.setProperty("myhippoproject:location",
                    dealDocThreeBean.getLocation());
            node.setProperty("myhippoproject:website",
                    dealDocThreeBean.getWebsite());
            node.setProperty("myhippoproject:industry",
                    dealDocThreeBean.getIndustry());
            node.setProperty("myhippoproject:description",
                    dealDocThreeBean.getDescription());
            node.setProperty("myhippoproject:founded",
                    dealDocThreeBean.getFounded());
            node.setProperty("myhippoproject:employees",
                    dealDocThreeBean.getEmployees());
            node.setProperty("myhippoproject:raising",
                    dealDocThreeBean.getRaising());
            node.setProperty("myhippoproject:per",
                    dealDocThreeBean.getPer());
             node.setProperty("myhippoproject:type",
                    dealDocThreeBean.getType());
            node.setProperty("myhippoproject:annualRevenue",
                    dealDocThreeBean.getAnnualRevenue());
            node.setProperty("myhippoproject:prevCapital",
                    dealDocThreeBean.getPrevCapital());
            return true;
        } catch (RepositoryException e) {
            throw new ContentNodeBindingException(e);
        }
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:double")
    public Double getDouble() {
        return getProperty("myhippoproject:double");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:fundRequired")
    public Double getFundRequired() {
        return getProperty("myhippoproject:fundRequired");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:requiredFund")
    public Double getRequiredFund() {
        return getProperty("myhippoproject:requiredFund");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:minInvestment")
    public Double getMinInvestment() {
        return getProperty("myhippoproject:minInvestment");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:endDate")
    public Calendar getEndDate() {
        return getProperty("myhippoproject:endDate");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:steps")
    public Long getSteps() {
        return getProperty("myhippoproject:steps");
    }

    //added translation id, creation date, last modified
    @XmlElement
    @HippoEssentialsGenerated(internalName = "hippotranslation:id")
    public String getId() {
        return getProperty("hippotranslation:id");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "hippostdpubwf:creationDate")
    public Calendar getcreationDate() {
        return getProperty("hippostdpubwf:creationDate");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "hippostdpubwf:lastModificationDate")
    public Calendar getlastModificationDate() {
        return getProperty("hippostdpubwf:lastModificationDate");
    }

}
