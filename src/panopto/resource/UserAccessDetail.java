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
 */package panopto.resource;

//javax
import javax.xml.bind.annotation.XmlRootElement;

import panopto.resource.collections.impl.GroupAccessDetails;
import panopto.resource.collections.impl.Ids;

@XmlRootElement(name="userAccessDetail")
public class UserAccessDetail
{
    private Ids foldersWithCreatorAccess;
    private Ids foldersWithViewerAccess;
    private GroupAccessDetails groupMembershipAccess;
    private Ids sessionsWithViewerAccess;
    private String systemRole;
    private String userId;

    public UserAccessDetail(){}

    public Ids getFoldersWithCreatorAccess() {
        return foldersWithCreatorAccess;
    }

    public void setFoldersWithCreatorAccess(Ids foldersWithCreatorAccess) {
        this.foldersWithCreatorAccess = foldersWithCreatorAccess;
    }

    public Ids getFoldersWithViewerAccess() {
        return foldersWithViewerAccess;
    }

    public void setFoldersWithViewerAccess(Ids foldersWithViewerAccess) {
        this.foldersWithViewerAccess = foldersWithViewerAccess;
    }

    public GroupAccessDetails getGroupMembershipAccess() {
        return groupMembershipAccess;
    }

    public void setGroupMembershipAccess(GroupAccessDetails groupMembershipAccess) {
        this.groupMembershipAccess = groupMembershipAccess;
    }

    public Ids getSessionsWithViewerAccess() {
        return sessionsWithViewerAccess;
    }

    public void setSessionsWithViewerAccess(Ids sessionsWithViewerAccess) {
        this.sessionsWithViewerAccess = sessionsWithViewerAccess;
    }

    public String getSystemRole() {
        return systemRole;
    }

    public void setSystemRole(String systemRole) {
        this.systemRole = systemRole;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
