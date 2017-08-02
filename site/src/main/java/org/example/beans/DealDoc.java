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

@XmlRootElement(name = "dealdoc")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "myhippoproject:DealDoc")
@Node(jcrType = "myhippoproject:DealDoc")
public class DealDoc extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:location")
    public String getLocation() {
        return getProperty("myhippoproject:location");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:annualRevenue")
    public Double getAnnualRevenue() {
        return getProperty("myhippoproject:annualRevenue");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:description")
    public String getDescription() {
        return getProperty("myhippoproject:description");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:industry")
    public String getIndustry() {
        return getProperty("myhippoproject:industry");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:employees")
    public Long getEmployees() {
        return getProperty("myhippoproject:employees");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:founded")
    public Long getFounded() {
        return getProperty("myhippoproject:founded");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:dilution")
    public Double getDilution() {
        return getProperty("myhippoproject:dilution");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:raising")
    public Double getRaising() {
        return getProperty("myhippoproject:raising");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:prevCapital")
    public Double getPrevCapital() {
        return getProperty("myhippoproject:prevCapital");
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:image")
    public HippoGalleryImageSet getImage() {
        return getLinkedBean("myhippoproject:image", HippoGalleryImageSet.class);
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:name")
    public String getName() {
        return getProperty("myhippoproject:name");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:url")
    public String getUrl() {
        return getProperty("myhippoproject:url");
    }
}
