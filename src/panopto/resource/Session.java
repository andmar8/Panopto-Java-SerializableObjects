/*
 * This file is part of Panopto-Java-SerializableObjects.
 * 
 * Panopto-Java-SerializableObjects is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Panopto-Java-SerializableObjects is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Panopto-Java-SerializableObjects.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright: Andrew Martin, Newcastle University
 * 
 */
package panopto.resource;

//javax
import java.util.Calendar;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import panopto.resource.collections.impl.Ids;

@XmlRootElement(name="session")
public class Session
{
    private String creatorId;
    private String description;
    private Double duration;
    private String editorUrl;
    private String folderId;
    private String id;
    private Boolean isBroadcast;
    private Boolean isDownloadable;
    private String mp3Url;
    private String mp4Url;
    private String name;
    private String notesURL;
    private String outputsPageUrl;
    private Ids remoteRecorderIds;
    private String sharePageUrl;
    private Calendar startTime;
    private String state;
    private String statusMessage;
    private String thumbUrl;
    private String viewerUrl;

    public Session(){}

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getEditorUrl() {
        return editorUrl;
    }

    public void setEditorUrl(String editorUrl) {
        this.editorUrl = editorUrl;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsBroadcast() {
        return isBroadcast;
    }

    public void setIsBroadcast(Boolean isBroadcast) {
        this.isBroadcast = isBroadcast;
    }

    public Boolean getIsDownloadable() {
        return isDownloadable;
    }

    public void setIsDownloadable(Boolean isDownloadable) {
        this.isDownloadable = isDownloadable;
    }

    public String getMp3Url() {
        return mp3Url;
    }

    public void setMp3Url(String mp3Url) {
        this.mp3Url = mp3Url;
    }

    public String getMp4Url() {
        return mp4Url;
    }

    public void setMp4Url(String mp4Url) {
        this.mp4Url = mp4Url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotesURL() {
        return notesURL;
    }

    public void setNotesURL(String notesURL) {
        this.notesURL = notesURL;
    }

    public String getOutputsPageUrl() {
        return outputsPageUrl;
    }

    public void setOutputsPageUrl(String outputsPageUrl) {
        this.outputsPageUrl = outputsPageUrl;
    }

    @XmlElement(name="remoteRecorderIds")
    public Ids getRemoteRecorderIds() {
        return remoteRecorderIds;
    }

    public void setRemoteRecorderIds(Ids remoteRecorderIds) {
        this.remoteRecorderIds = remoteRecorderIds;
    }

    public String getSharePageUrl() {
        return sharePageUrl;
    }

    public void setSharePageUrl(String sharePageUrl) {
        this.sharePageUrl = sharePageUrl;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getViewerUrl() {
        return viewerUrl;
    }

    public void setViewerUrl(String viewerUrl) {
        this.viewerUrl = viewerUrl;
    }
}
