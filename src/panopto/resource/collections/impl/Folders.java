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
import panopto.resource.Folder;

@XmlRootElement(name="folders")
public class Folders
{
    private List<Folder> folders;

    public Folders(){folders = new java.util.ArrayList<Folder>();}
    public Folders(List<Folder> folders){this.folders = folders;}
    @XmlElement(name="folder")
    public List<Folder> getFolders(){return this.folders;}
    public void setFolders(List<Folder> folders){this.folders = folders;}

    public void addFolder(Folder folder){this.folders.add(folder);}
    public Folder getAFolder(String folderId)
    {
        Folder temp;
        java.util.Iterator<Folder> i = this.folders.iterator();
        while(i.hasNext())
        {
            temp = i.next();
            if(temp.getId().equals(folderId))
            {
                return temp;
            }
        }
        return null;
    }
}
