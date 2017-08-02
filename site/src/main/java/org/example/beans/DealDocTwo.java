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

@XmlRootElement(name = "dealdoctwo")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "myhippoproject:DealDocTwo")
@Node(jcrType = "myhippoproject:DealDocTwo")
public class DealDocTwo extends DealDoc {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:url")
    public String getUrl() {
        return getProperty("myhippoproject:url");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:name")
    public String getName() {
        return getProperty("myhippoproject:name");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:string_location")
    public String getString_location() {
        return getProperty("myhippoproject:string_location");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:label_industry")
    public String getLabel_industry() {
        return getProperty("myhippoproject:label_industry");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:employee_count")
    public Long getEmployee_count() {
        return getProperty("myhippoproject:employee_count");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:raise")
    public Double getRaise() {
        return getProperty("myhippoproject:raise");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:year_founded")
    public Long getYear_founded() {
        return getProperty("myhippoproject:year_founded");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:dilution_percent")
    public Double getDilution_percent() {
        return getProperty("myhippoproject:dilution_percent");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:revenue")
    public Double getRevenue() {
        return getProperty("myhippoproject:revenue");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:previous_capital")
    public Double getPrevious_capital() {
        return getProperty("myhippoproject:previous_capital");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:descript")
    public String getDescript() {
        return getProperty("myhippoproject:descript");
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:imagelink")
    public HippoGalleryImageSet getImagelink() {
        return getLinkedBean("myhippoproject:imagelink",
                HippoGalleryImageSet.class);
    }
}
