package com.qaswatech.alumni.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageKitResponse2 {
    @SerializedName("fileId")
    @Expose
    private String fileId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("filePath")
    @Expose
    private String filePath;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("fileType")
    @Expose
    private String fileType;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public String toString() {
        return "ImageKitResponse2{" + "fileId=" + fileId + ", name=" + name + ", size=" + size + ", filePath=" + filePath + ", url=" + url + ", fileType=" + fileType + ", height=" + height + ", width=" + width + ", thumbnailUrl=" + thumbnailUrl + '}';
    }
    
    
}
