/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrasjon.restimpl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "BusinessFault")
@XmlType(name = "BusinessFault", propOrder = {
    "id",
    "message"
})
public class BusinessFault implements Serializable{
    private String id;    
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
     @Override
    public String toString() {
        return "BusinessFault{" +
                "id=" + id +
                ", message='" + message+'}';
    }
    
}
