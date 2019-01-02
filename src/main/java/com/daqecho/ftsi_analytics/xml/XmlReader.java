
package com.daqecho.ftsi_analytics.xml;
import java.io.File;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.util.Elements;
import javax.xml.bind.JAXBException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.w3c.dom.NodeList;

public class XmlReader
{ 
    public static void load() throws JAXBException
    {
          XmlReader r = new XmlReader();
        r.readxml();
      XmlWriter xw = new XmlWriter();
      xw.doer();
    }
    public void readxml()
    {
        File inputFile = new File("C:\\Users\\oilfi\\Documents\\FTSI_Analytics\\FTSI_Analytics\\src\\main\\java\\com\\daqecho\\ftsi_analytics\\input.txt");
        SAXReader reader = new SAXReader();
        Document document = null;
        try
        {
            document = reader.read( inputFile );
        } catch (DocumentException ex)
        {
            Logger.getLogger(XmlReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Root element :" + document.getRootElement().getName());
 Element rootElement = document.getRootElement();        
    List<Element> list =  rootElement.elements("std");

    for (Element element : list) {
        System.out.println(element.elementTextTrim("name"));
        List<Element> sublist =  element.elements("sub");
        for (Element element2 : sublist) {
            System.out.println(element2.elementTextTrim("sub1"));
            System.out.println(element2.elementTextTrim("sub2"));
        }

    }}
}