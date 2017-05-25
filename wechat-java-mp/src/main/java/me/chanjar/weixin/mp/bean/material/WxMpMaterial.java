package me.chanjar.weixin.mp.bean.material;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class WxMpMaterial {

    private String name;
    private InputStream inputStream;
    private String contentType;
    private String videoTitle;
    private String videoIntroduction;

    public WxMpMaterial() {
    }
    
    public WxMpMaterial(String name, InputStream inputStream, String contentType,  String videoTitle, String videoIntroduction) {
        this.name = name;
        this.inputStream = inputStream;
        this.videoTitle = videoTitle;
        this.videoIntroduction = videoIntroduction;
    }

    public Map<String, String> getForm() {
        Map<String, String> form = new HashMap<>();
        form.put("title", this.videoTitle);
        form.put("introduction", this.videoIntroduction);
        return form;
    }

    public String getVideoTitle() {
        return this.videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoIntroduction() {
        return this.videoIntroduction;
    }

    public void setVideoIntroduction(String videoIntroduction) {
        this.videoIntroduction = videoIntroduction;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public InputStream getInputStream() {
        return inputStream;
    }
    
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
    
    public String getContentType() {
        return contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    
    @Override
    public String toString() {
        return "WxMpMaterial [" + "name=" + this.name + ", videoTitle=" + this.videoTitle + ", videoIntroduction=" + this.videoIntroduction + "]";
    }
}
