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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import panopto.resource.collections.impl.Ids;

@XmlRootElement(name="folder")
public class Folder
{
    private Boolean allowPublicNotes;
    private Boolean allowSessionDownload;
    private String audioPodcastITunesUrl;
    private String audioRssUrl;
    private Ids childFolderIds;
    private String description;
    private Boolean enablePodcast;
    private String id;
    private Boolean isPublic;
    private String listUrl;
    private String name;
    private String parentFolder;
    private Ids sessionIds;
    private String settingsUrl;
    private String videoPodcastITunesUrl;
    private String videoRssUrl;

    public Folder(){}

    public Boolean getAllowPublicNotes() {
        return allowPublicNotes;
    }

    public void setAllowPublicNotes(Boolean allowPublicNotes) {
        this.allowPublicNotes = allowPublicNotes;
    }

    public Boolean getAllowSessionDownload() {
        return allowSessionDownload;
    }

    public void setAllowSessionDownload(Boolean allowSessionDownload) {
        this.allowSessionDownload = allowSessionDownload;
    }

    public String getAudioPodcastITunesUrl() {
        return audioPodcastITunesUrl;
    }

    public void setAudioPodcastITunesUrl(String audioPodcastITunesUrl) {
        this.audioPodcastITunesUrl = audioPodcastITunesUrl;
    }

    public String getAudioRssUrl() {
        return audioRssUrl;
    }

    public void setAudioRssUrl(String audioRssUrl) {
        this.audioRssUrl = audioRssUrl;
    }

    public Ids getChildFolderIds() {
        return childFolderIds;
    }

    public void setChildFolderIds(Ids childFolderIds) {
        this.childFolderIds = childFolderIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnablePodcast() {
        return enablePodcast;
    }

    public void setEnablePodcast(Boolean enablePodcast) {
        this.enablePodcast = enablePodcast;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getListUrl() {
        return listUrl;
    }

    public void setListUrl(String listUrl) {
        this.listUrl = listUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(String parentFolder) {
        this.parentFolder = parentFolder;
    }

    @XmlElement(name="sessionIds")
    public Ids getSessionIds()
    {
        return this.sessionIds;
    }

    public void setSessionIds(Ids sessionIds)
    {
        this.sessionIds = sessionIds;
    }

    public String getSettingsUrl() {
        return settingsUrl;
    }

    public void setSettingsUrl(String settingsUrl) {
        this.settingsUrl = settingsUrl;
    }

    public String getVideoPodcastITunesUrl() {
        return videoPodcastITunesUrl;
    }

    public void setVideoPodcastITunesUrl(String videoPodcastITunesUrl) {
        this.videoPodcastITunesUrl = videoPodcastITunesUrl;
    }

    public String getVideoRssUrl() {
        return videoRssUrl;
    }

    public void setVideoRssUrl(String videoRssUrl) {
        this.videoRssUrl = videoRssUrl;
    }
}
