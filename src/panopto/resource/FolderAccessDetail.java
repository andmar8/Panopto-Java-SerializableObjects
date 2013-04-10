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

import panopto.resource.collections.impl.Ids;

@XmlRootElement(name="folderAccessDetail")
public class FolderAccessDetail
{
    private String folderId;
    private Ids groupsWithCreatorAccess;
    private Ids groupsWithViewerAccess;
    private Boolean isPublic;
    private Ids usersWithCreatorAccess;
    private Ids usersWithViewerAccess;

    public FolderAccessDetail(){}

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public Ids getGroupsWithCreatorAccess() {
        return groupsWithCreatorAccess;
    }

    public void setGroupsWithCreatorAccess(Ids groupsWithCreatorAccess) {
        this.groupsWithCreatorAccess = groupsWithCreatorAccess;
    }

    public Ids getGroupsWithViewerAccess() {
        return groupsWithViewerAccess;
    }

    public void setGroupsWithViewerAccess(Ids groupsWithViewerAccess) {
        this.groupsWithViewerAccess = groupsWithViewerAccess;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Ids getUsersWithCreatorAccess() {
        return usersWithCreatorAccess;
    }

    public void setUsersWithCreatorAccess(Ids usersWithCreatorAccess) {
        this.usersWithCreatorAccess = usersWithCreatorAccess;
    }

    public Ids getUsersWithViewerAccess() {
        return usersWithViewerAccess;
    }

    public void setUsersWithViewerAccess(Ids usersWithViewerAccess) {
        this.usersWithViewerAccess = usersWithViewerAccess;
    }
}
