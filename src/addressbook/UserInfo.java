/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.io.Serializable;

/**
 *
 * @author Ohjelmistokehitys
 */
public class UserInfo implements Serializable 
{
    private String name;
    private String address;
    private String phone;

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName() 
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    
    
}
