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
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="remoteRecorderDevice")
public class RemoteRecorderDevice
{
    private String deviceType;
    private Boolean isCapturing;
    private String name;

    public RemoteRecorderDevice(){}

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Boolean getIsCapturing() {
        return isCapturing;
    }

    public void setIsCapturing(Boolean isCapturing) {
        this.isCapturing = isCapturing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
