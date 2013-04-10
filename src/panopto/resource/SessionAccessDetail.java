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

@XmlRootElement(name="sessionAccessDetail")
public class SessionAccessDetail
{
    private FolderAccessDetail folderAccess;
    private Ids groupsWithDirectViewerAccess;
    private Boolean inheritViewerAccess;
    private Boolean isPublic;
    private String sessionId;
    private Ids usersWithDirectViewerAccess;

    public SessionAccessDetail(){}

    public FolderAccessDetail getFolderAccess() {
        return folderAccess;
    }

    public void setFolderAccess(FolderAccessDetail folderAccess) {
        this.folderAccess = folderAccess;
    }

    public Ids getGroupsWithDirectViewerAccess() {
        return groupsWithDirectViewerAccess;
    }

    public void setGroupsWithDirectViewerAccess(Ids groupsWithDirectViewerAccess) {
        this.groupsWithDirectViewerAccess = groupsWithDirectViewerAccess;
    }

    public Boolean getInheritViewerAccess() {
        return inheritViewerAccess;
    }

    public void setInheritViewerAccess(Boolean inheritViewerAccess) {
        this.inheritViewerAccess = inheritViewerAccess;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Ids getUsersWithDirectViewerAccess() {
        return usersWithDirectViewerAccess;
    }

    public void setUsersWithDirectViewerAccess(Ids usersWithDirectViewerAccess) {
        this.usersWithDirectViewerAccess = usersWithDirectViewerAccess;
    }
}
