/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daqecho.ftsi_analytics.xml;

import com.daqecho.ftsi_analytics.Channel_item;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author oilfi
 */
public class XmlWriter
{


    public XmlWriter() throws JAXBException
    {
   doer();    
    }

    public void doer() throws JAXBException
    {
      Channel_item dvd = new Channel_item(101, "Lord of the Rings", 10);
JAXBContext context = JAXBContext.newInstance(Channel_item.class);
Marshaller marshaller = context.createMarshaller();
marshaller.marshal(dvd, System.out);    
  }

}
