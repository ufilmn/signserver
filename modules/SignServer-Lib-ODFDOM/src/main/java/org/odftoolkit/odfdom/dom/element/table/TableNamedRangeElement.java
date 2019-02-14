/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableCellRangeAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableBaseCellAddressAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableRangeUsableAsAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:named-range}.
 *
 */
public abstract class TableNamedRangeElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "named-range" );


	/**
	 * Create the instance of <code>TableNamedRangeElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableNamedRangeElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:named-range}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableNamedRangeElement}
	 *
     * @param tableNameAttributeValue  The mandatory attribute {@odf.attribute  table:name}"
     * @param tableCellRangeAddressAttributeValue  The mandatory attribute {@odf.attribute  table:cell-range-address}"
     *
	 */
	public void init(String tableNameAttributeValue, String tableCellRangeAddressAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableNameAttribute()
	{
		TableNameAttribute attr = (TableNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @param tableNameValue   The type is <code>String</code>
	 */
	public void setTableNameAttribute( String tableNameValue )
	{
		TableNameAttribute attr =  new TableNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableCellRangeAddressAttribute</code> , See {@odf.attribute table:cell-range-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableCellRangeAddressAttribute()
	{
		TableCellRangeAddressAttribute attr = (TableCellRangeAddressAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "cell-range-address" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableCellRangeAddressAttribute</code> , See {@odf.attribute table:cell-range-address}
	 *
	 * @param tableCellRangeAddressValue   The type is <code>String</code>
	 */
	public void setTableCellRangeAddressAttribute( String tableCellRangeAddressValue )
	{
		TableCellRangeAddressAttribute attr =  new TableCellRangeAddressAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableCellRangeAddressValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableBaseCellAddressAttribute</code> , See {@odf.attribute table:base-cell-address}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableBaseCellAddressAttribute()
	{
		TableBaseCellAddressAttribute attr = (TableBaseCellAddressAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "base-cell-address" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableBaseCellAddressAttribute</code> , See {@odf.attribute table:base-cell-address}
	 *
	 * @param tableBaseCellAddressValue   The type is <code>String</code>
	 */
	public void setTableBaseCellAddressAttribute( String tableBaseCellAddressValue )
	{
		TableBaseCellAddressAttribute attr =  new TableBaseCellAddressAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableBaseCellAddressValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableRangeUsableAsAttribute</code> , See {@odf.attribute table:range-usable-as}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableRangeUsableAsAttribute()
	{
		TableRangeUsableAsAttribute attr = (TableRangeUsableAsAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "range-usable-as" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return TableRangeUsableAsAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableRangeUsableAsAttribute</code> , See {@odf.attribute table:range-usable-as}
	 *
	 * @param tableRangeUsableAsValue   The type is <code>String</code>
	 */
	public void setTableRangeUsableAsAttribute( String tableRangeUsableAsValue )
	{
		TableRangeUsableAsAttribute attr =  new TableRangeUsableAsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableRangeUsableAsValue );
	}

}
