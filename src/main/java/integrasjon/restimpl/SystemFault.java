/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrasjon.restimpl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "SystemFault")
@XmlType(name = "SystemFault", propOrder = {
    "id",
    "message",
    "error"
})
public class SystemFault implements Serializable{
    private String id;    
    private String message;
    private String error;

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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
    @Override
    public String toString() {
        return "SystemFault{" +
                "id=" + id +
                ",message='" + message+
                ",error"+error+'}';
    }
    
}
