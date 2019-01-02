/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daqecho.ftsi_analytics;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Channel_item{
    private int id;
    private String name;
    private long price;
    
    public Channel_item(){
        // no argument constructor required by JAXB
    }
    public Channel_item(int id, String name, long price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public long getPrice() {
        return price;
    }   
    
}

