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
import panopto.resource.collections.impl.RemoteRecorderDevices;

@XmlRootElement(name="remoteRecorder")
public class RemoteRecorder
{
    private RemoteRecorderDevices devices;
    private String id;
    private String machineIP;
    private String name;
    private String previewUrl;
    private Ids scheduledRecordings;
    private String settingsUrl;
    private String state;

    public RemoteRecorder(){}

    @XmlElement(name="remoteRecorderDevices")
    public RemoteRecorderDevices getDevices() {
        return devices;
    }

    public void setDevices(RemoteRecorderDevices devices) {
        this.devices = devices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMachineIP() {
        return machineIP;
    }

    public void setMachineIP(String machineIP) {
        this.machineIP = machineIP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    @XmlElement(name="scheduledRecordingIds")
    public Ids getScheduledRecordings() {
        return scheduledRecordings;
    }

    public void setScheduledRecordings(Ids scheduledRecordings) {
        this.scheduledRecordings = scheduledRecordings;
    }

    public String getSettingsUrl() {
        return settingsUrl;
    }

    public void setSettingsUrl(String settingsUrl) {
        this.settingsUrl = settingsUrl;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
