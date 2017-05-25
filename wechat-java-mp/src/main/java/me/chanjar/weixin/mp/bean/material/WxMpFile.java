package me.chanjar.weixin.mp.bean.material;

import java.io.InputStream;

public class WxMpFile {
    private String filename;
    private InputStream stream;
    private String contentType;
    
    public String getFilename() {
        return filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public InputStream getStream() {
        return stream;
    }
    
    public void setStream(InputStream stream) {
        this.stream = stream;
    }
    
    public String getContentType() {
        return contentType;
    }
    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
