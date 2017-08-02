package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoCompound;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;

@HippoEssentialsGenerated(internalName = "myhippoproject:DealItem")
@Node(jcrType = "myhippoproject:DealItem")
public class DealItem extends HippoCompound {
    @HippoEssentialsGenerated(internalName = "myhippoproject:string")
    public String getString() {
        return getProperty("myhippoproject:string");
    }

    @HippoEssentialsGenerated(internalName = "myhippoproject:string__")
    public String getString__() {
        return getProperty("myhippoproject:string__");
    }
}
