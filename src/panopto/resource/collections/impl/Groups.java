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
import panopto.resource.Group;

@XmlRootElement(name="groups")
public class Groups
{
    private List<Group> groups;

    public Groups(){this.groups = new java.util.ArrayList<Group>();}
    public Groups(List<Group> groups){this.groups = groups;}
    @XmlElement(name="group")
    public List<Group> getGroups(){return this.groups;}
    public void setGroups(List<Group> groups){this.groups = groups;}

    public void addGroup(Group group){this.groups.add(group);}
    public Group getAGroup(String groupId)
    {
        Group temp;
        java.util.Iterator<Group> i = this.groups.iterator();
        while(i.hasNext())
        {
            temp = i.next();
            if(temp.getId().equals(groupId))
            {
                return temp;
            }
        }
        return null;
    }
}
