package com.peterfranza.gwt.jaxb.client.objs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="namedObject")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestSubNamedObject extends TestSubObject{

	@XmlAttribute
	public String objattr;

}
