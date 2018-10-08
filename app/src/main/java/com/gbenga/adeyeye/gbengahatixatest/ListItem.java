package com.gbenga.adeyeye.gbengahatixatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListItem {

    private String campaign;
    private String camp;
    private String imageUrl;
    private String actionLink;
    private String viewCount;

    public ListItem(String campaign, String camp, String imageUrl, String viewCount) {
        this.campaign = campaign;
        this.camp = camp;
        this.imageUrl = imageUrl;
        this.viewCount = viewCount;
        this.actionLink = actionLink;
    }

    public String getCampaign() {
        return campaign;
    }

    public String getCamp() {
        return camp;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getViewCount() {
        return viewCount;
    }

    public String getActionLink() {
        return actionLink;
    }
}
