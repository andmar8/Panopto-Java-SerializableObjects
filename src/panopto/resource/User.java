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

@XmlRootElement(name="user")
public class User
{
    private String email;
    private Boolean emailSessionNotifications;
    private String firstName;
    private Ids groupMemberships;
    private String lastName;
    private String systemRole;
    private String userBio;
    private String userId;
    private String userKey;
    private String userSettingsUrl;

    public User(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailSessionNotifications() {
        return emailSessionNotifications;
    }

    public void setEmailSessionNotifications(Boolean emailSessionNotifications) {
        this.emailSessionNotifications = emailSessionNotifications;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Ids getGroupMemberships() {
        return groupMemberships;
    }

    public void setGroupMemberships(Ids groupMemberships) {
        this.groupMemberships = groupMemberships;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSystemRole() {
        return systemRole;
    }

    public void setSystemRole(String systemRole) {
        this.systemRole = systemRole;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getUserSettingsUrl() {
        return userSettingsUrl;
    }

    public void setUserSettingsUrl(String userSettingsUrl) {
        this.userSettingsUrl = userSettingsUrl;
    }
}
