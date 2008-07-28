/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Fosstrak (www.fosstrak.org).
 *
 * Fosstrak is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Fosstrak is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Fosstrak; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.21 at 05:25:46 PM CEST 
//


package org.fosstrak.reader.rp.proxy.configurator;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationChannelConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationChannelConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationChannelHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationChannelPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transportProtocol" type="{}TransportProtocol"/>
 *         &lt;element name="notificationChannelMode" type="{}NotificationChannelMode"/>
 *         &lt;element name="sources" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notificationTriggers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="triggerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationChannelConfiguration", propOrder = {
    "notificationChannelHost",
    "notificationChannelPort",
    "transportProtocol",
    "notificationChannelMode",
    "sources",
    "notificationTriggers",
    "dataSelector"
})
public class NotificationChannelConfiguration {

    protected String notificationChannelHost;
    @XmlElement(type = Integer.class)
    protected int notificationChannelPort;
    protected TransportProtocol transportProtocol;
    protected NotificationChannelMode notificationChannelMode;
    protected Sources sources;
    protected NotificationTriggers notificationTriggers;
    protected String dataSelector;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the notificationChannelHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationChannelHost() {
        return notificationChannelHost;
    }

    /**
     * Sets the value of the notificationChannelHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationChannelHost(String value) {
        this.notificationChannelHost = value;
    }

    /**
     * Gets the value of the notificationChannelPort property.
     * 
     */
    public int getNotificationChannelPort() {
        return notificationChannelPort;
    }

    /**
     * Sets the value of the notificationChannelPort property.
     * 
     */
    public void setNotificationChannelPort(int value) {
        this.notificationChannelPort = value;
    }

    /**
     * Gets the value of the transportProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link TransportProtocol }
     *     
     */
    public TransportProtocol getTransportProtocol() {
        return transportProtocol;
    }

    /**
     * Sets the value of the transportProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportProtocol }
     *     
     */
    public void setTransportProtocol(TransportProtocol value) {
        this.transportProtocol = value;
    }

    /**
     * Gets the value of the notificationChannelMode property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationChannelMode }
     *     
     */
    public NotificationChannelMode getNotificationChannelMode() {
        return notificationChannelMode;
    }

    /**
     * Sets the value of the notificationChannelMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationChannelMode }
     *     
     */
    public void setNotificationChannelMode(NotificationChannelMode value) {
        this.notificationChannelMode = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link Sources }
     *     
     */
    public Sources getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sources }
     *     
     */
    public void setSources(Sources value) {
        this.sources = value;
    }

    /**
     * Gets the value of the notificationTriggers property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationTriggers }
     *     
     */
    public NotificationTriggers getNotificationTriggers() {
        return notificationTriggers;
    }

    /**
     * Sets the value of the notificationTriggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationTriggers }
     *     
     */
    public void setNotificationTriggers(NotificationTriggers value) {
        this.notificationTriggers = value;
    }

    /**
     * Gets the value of the dataSelector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSelector() {
        return dataSelector;
    }

    /**
     * Sets the value of the dataSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSelector(String value) {
        this.dataSelector = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="triggerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "triggerName"
    })
    public static class NotificationTriggers {

        protected List<String> triggerName;

        /**
         * Gets the value of the triggerName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the triggerName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTriggerName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTriggerName() {
            if (triggerName == null) {
                triggerName = new ArrayList<String>();
            }
            return this.triggerName;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "source"
    })
    public static class Sources {

        protected List<String> source;

        /**
         * Gets the value of the source property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the source property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSource() {
            if (source == null) {
                source = new ArrayList<String>();
            }
            return this.source;
        }

    }

}
