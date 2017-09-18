package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import java.util.Calendar;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onehippo.cms7.essentials.components.rest.adapters.HippoGalleryImageAdapter;

@XmlRootElement(name = "eventitem")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "myhippoproject:EventItem")
@Node(jcrType = "myhippoproject:EventItem")
public class EventItem extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:title")
    public String getTitle() {
        return getProperty("myhippoproject:title");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:description")
    public String getDescription() {
        return getProperty("myhippoproject:description");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:startDate")
    public Calendar getStartDate() {
        return getProperty("myhippoproject:startDate");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:endDate")
    public Calendar getEndDate() {
        return getProperty("myhippoproject:endDate");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:agenda")
    public String getAgenda() {
        return getProperty("myhippoproject:agenda");
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:image")
    public HippoGalleryImageSet getImage() {
        return getLinkedBean("myhippoproject:image", HippoGalleryImageSet.class);
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:location")
    public String getLocation() {
        return getProperty("myhippoproject:location");
    }
}
