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
package panopto.resource.collections.impl;

//java
import java.util.List;

//javax
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import panopto.resource.RemoteRecorderDevice;

@XmlRootElement(name="remoteRecorderDevices")
public class RemoteRecorderDevices
{
    private List<RemoteRecorderDevice> remoteRecorderDevices;

    public RemoteRecorderDevices(){this.remoteRecorderDevices = new java.util.ArrayList<RemoteRecorderDevice>();}
    public RemoteRecorderDevices(List<RemoteRecorderDevice> remoteRecorders){this.remoteRecorderDevices = remoteRecorders;}
    @XmlElement(name="remoteRecorderDevice")
    public List<RemoteRecorderDevice> getRemoteRecorderDevices(){return this.remoteRecorderDevices;}
    public void setRemoteRecorderDevices(List<RemoteRecorderDevice> remoteRecorders){this.remoteRecorderDevices = remoteRecorders;}
    public void addRemoteRecorderDevice(RemoteRecorderDevice remoteRecorder){this.remoteRecorderDevices.add(remoteRecorder);}
    public RemoteRecorderDevice getARemoteRecorderDevice(String remoteRecorderDeviceName)
    {
        RemoteRecorderDevice temp;
        java.util.Iterator<RemoteRecorderDevice> i = this.remoteRecorderDevices.iterator();
        while(i.hasNext())
        {
            temp = i.next();
            if(temp.getName().equals(remoteRecorderDeviceName))
            {
                return temp;
            }
        }
        return null;
    }
}
