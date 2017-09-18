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

@XmlRootElement(name = "mynewsitem")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "myhippoproject:MyNewsItem")
@Node(jcrType = "myhippoproject:MyNewsItem")
public class MyNewsItem extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:title")
    public String getTitle() {
        return getProperty("myhippoproject:title");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:content")
    public String getContent() {
        return getProperty("myhippoproject:content");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:author")
    public String getAuthor() {
        return getProperty("myhippoproject:author");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:date")
    public Calendar getDate() {
        return getProperty("myhippoproject:date");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:location")
    public String getLocation() {
        return getProperty("myhippoproject:location");
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "myhippoproject:image")
    public HippoGalleryImageSet getImage() {
        return getLinkedBean("myhippoproject:image", HippoGalleryImageSet.class);
    }
}
