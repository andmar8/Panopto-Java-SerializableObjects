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
import panopto.resource.GroupAccessDetail;

@XmlRootElement(name="groupAccessDetails")
public class GroupAccessDetails
{
    private List<GroupAccessDetail> groupAccessDetails;

    public GroupAccessDetails(){this.groupAccessDetails = new java.util.ArrayList<GroupAccessDetail>();}
    public GroupAccessDetails(List<GroupAccessDetail> groupAccessDetails){this.groupAccessDetails = groupAccessDetails;}
    @XmlElement(name="groupAccessDetail")
    public List<GroupAccessDetail> getGroupAccessDetails(){return this.groupAccessDetails;}
    public void setGroupAccessDetails(List<GroupAccessDetail> groupAccessDetails){this.groupAccessDetails = groupAccessDetails;}

    public void addGroupAccessDetail(GroupAccessDetail groupAccessDetail){this.groupAccessDetails.add(groupAccessDetail);}
    public GroupAccessDetail getAGroupAccessDetail(String groupId)
    {
        GroupAccessDetail temp;
        java.util.Iterator<GroupAccessDetail> i = this.groupAccessDetails.iterator();
        while(i.hasNext())
        {
            temp = i.next();
            if(temp.getGroupId().equals(groupId))
            {
                return temp;
            }
        }
        return null;
    }
}
