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
import panopto.resource.User;

@XmlRootElement(name="users")
public class Users
{
    private List<User> users;

    public Users(){users = new java.util.ArrayList<User>();}
    public Users(List<User> users){this.users = users;}
    @XmlElement(name="user")
    public List<User> getUsers(){return this.users;}
    public void setUsers(List<User> users){this.users = users;}

    public void addUser(User user){this.users.add(user);}
    public User getAUser(String userId)
    {
        User temp;
        java.util.Iterator<User> i = this.users.iterator();
        while(i.hasNext())
        {
            temp = i.next();
            if(temp.getUserId().equals(userId))
            {
                return temp;
            }
        }
        return null;
    }
}
