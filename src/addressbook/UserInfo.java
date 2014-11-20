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
    
    public String getName() 
    {
        return name;
    }
    
    
    
}
