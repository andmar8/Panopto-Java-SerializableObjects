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
import panopto.resource.Session;

@XmlRootElement(name="sessions")
public class Sessions
{
    private List<Session> sessions;

    public Sessions(){sessions = new java.util.ArrayList<Session>();}
    public Sessions(List<Session> sessions){this.sessions = sessions;}
    @XmlElement(name="session")
    public List<Session> getSessions(){return this.sessions;}
    public void setSessions(List<Session> sessions){this.sessions = sessions;}

    public void addSession(Session session){this.sessions.add(session);}
    public Session getASession(String sessionId)
    {
        Session temp;
        java.util.Iterator<Session> i = this.sessions.iterator();
        while(i.hasNext())
        {
            temp = i.next();
            if(temp.getId().equals(sessionId))
            {
                return temp;
            }
        }
        return null;
    }
}
