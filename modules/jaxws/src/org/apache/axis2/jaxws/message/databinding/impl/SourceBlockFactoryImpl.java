/*
 * Copyright 2004,2005 The Apache Software Foundation.
 * Copyright 2006 International Business Machines Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.axis2.jaxws.message.databinding.impl;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.Source;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.jaxws.message.Block;
import org.apache.axis2.jaxws.message.MessageException;
import org.apache.axis2.jaxws.message.factory.SourceBlockFactory;
import org.apache.axis2.jaxws.message.impl.BlockFactoryImpl;

/**
 * SourceBlockFactoryImpl
 * 
 * Creates a SourceBlock
 */
public class SourceBlockFactoryImpl extends BlockFactoryImpl implements SourceBlockFactory {

	/**
	 * Default Constructor required for Factory 
	 */
	public SourceBlockFactoryImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.apache.axis2.jaxws.message.BlockFactory#createFrom(java.lang.Object, java.lang.Object, javax.xml.namespace.QName)
	 */
	public Block createFrom(Object businessObject, Object context, QName qName) throws MessageException {
		return new SourceBlockImpl((Source) businessObject, qName, this);
	}


	/* (non-Javadoc)
	 * @see org.apache.axis2.jaxws.message.BlockFactory#createFrom(org.apache.axiom.om.OMElement, java.lang.Object, javax.xml.namespace.QName)
	 */
	public Block createFrom(OMElement omElement, Object context, QName qName) throws XMLStreamException {
		return new SourceBlockImpl(omElement, qName, this);
	}

}
