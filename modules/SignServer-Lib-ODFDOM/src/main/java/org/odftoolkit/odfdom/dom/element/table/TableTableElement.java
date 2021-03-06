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
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTemplateNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUseFirstRowStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUseLastRowStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUseFirstColumnStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUseLastColumnStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUseBandingRowsStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableUseBandingColumnsStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableProtectedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableProtectionKeyAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableProtectionKeyDigestAlgorithmAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePrintAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePrintRangesAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableIsSubTableAttribute;

import org.odftoolkit.odfdom.dom.element.office.OfficeDdeSourceElement;
import org.odftoolkit.odfdom.dom.element.form.FormFormElement;
import org.odftoolkit.odfdom.dom.element.xforms.XformsModelElement;
import org.odftoolkit.odfdom.dom.element.text.TextSoftPageBreakElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:table}.
 *
 */
public abstract class TableTableElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "table" );


	/**
	 * Create the instance of <code>TableTableElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableTableElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME, OdfStyleFamily.Table, OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "style-name" )	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:table}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
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
	 * Receives the value of the ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableStyleNameAttribute()
	{
		TableStyleNameAttribute attr = (TableStyleNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "style-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @param tableStyleNameValue   The type is <code>String</code>
	 */
	public void setTableStyleNameAttribute( String tableStyleNameValue )
	{
		TableStyleNameAttribute attr =  new TableStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTemplateNameAttribute</code> , See {@odf.attribute table:template-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableTemplateNameAttribute()
	{
		TableTemplateNameAttribute attr = (TableTemplateNameAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "template-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTemplateNameAttribute</code> , See {@odf.attribute table:template-name}
	 *
	 * @param tableTemplateNameValue   The type is <code>String</code>
	 */
	public void setTableTemplateNameAttribute( String tableTemplateNameValue )
	{
		TableTemplateNameAttribute attr =  new TableTemplateNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableTemplateNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUseFirstRowStylesAttribute</code> , See {@odf.attribute table:use-first-row-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableUseFirstRowStylesAttribute()
	{
		TableUseFirstRowStylesAttribute attr = (TableUseFirstRowStylesAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "use-first-row-styles" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableUseFirstRowStylesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUseFirstRowStylesAttribute</code> , See {@odf.attribute table:use-first-row-styles}
	 *
	 * @param tableUseFirstRowStylesValue   The type is <code>Boolean</code>
	 */
	public void setTableUseFirstRowStylesAttribute( Boolean tableUseFirstRowStylesValue )
	{
		TableUseFirstRowStylesAttribute attr =  new TableUseFirstRowStylesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableUseFirstRowStylesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUseLastRowStylesAttribute</code> , See {@odf.attribute table:use-last-row-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableUseLastRowStylesAttribute()
	{
		TableUseLastRowStylesAttribute attr = (TableUseLastRowStylesAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "use-last-row-styles" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableUseLastRowStylesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUseLastRowStylesAttribute</code> , See {@odf.attribute table:use-last-row-styles}
	 *
	 * @param tableUseLastRowStylesValue   The type is <code>Boolean</code>
	 */
	public void setTableUseLastRowStylesAttribute( Boolean tableUseLastRowStylesValue )
	{
		TableUseLastRowStylesAttribute attr =  new TableUseLastRowStylesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableUseLastRowStylesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUseFirstColumnStylesAttribute</code> , See {@odf.attribute table:use-first-column-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableUseFirstColumnStylesAttribute()
	{
		TableUseFirstColumnStylesAttribute attr = (TableUseFirstColumnStylesAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "use-first-column-styles" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableUseFirstColumnStylesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUseFirstColumnStylesAttribute</code> , See {@odf.attribute table:use-first-column-styles}
	 *
	 * @param tableUseFirstColumnStylesValue   The type is <code>Boolean</code>
	 */
	public void setTableUseFirstColumnStylesAttribute( Boolean tableUseFirstColumnStylesValue )
	{
		TableUseFirstColumnStylesAttribute attr =  new TableUseFirstColumnStylesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableUseFirstColumnStylesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUseLastColumnStylesAttribute</code> , See {@odf.attribute table:use-last-column-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableUseLastColumnStylesAttribute()
	{
		TableUseLastColumnStylesAttribute attr = (TableUseLastColumnStylesAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "use-last-column-styles" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableUseLastColumnStylesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUseLastColumnStylesAttribute</code> , See {@odf.attribute table:use-last-column-styles}
	 *
	 * @param tableUseLastColumnStylesValue   The type is <code>Boolean</code>
	 */
	public void setTableUseLastColumnStylesAttribute( Boolean tableUseLastColumnStylesValue )
	{
		TableUseLastColumnStylesAttribute attr =  new TableUseLastColumnStylesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableUseLastColumnStylesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUseBandingRowsStylesAttribute</code> , See {@odf.attribute table:use-banding-rows-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableUseBandingRowsStylesAttribute()
	{
		TableUseBandingRowsStylesAttribute attr = (TableUseBandingRowsStylesAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "use-banding-rows-styles" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableUseBandingRowsStylesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUseBandingRowsStylesAttribute</code> , See {@odf.attribute table:use-banding-rows-styles}
	 *
	 * @param tableUseBandingRowsStylesValue   The type is <code>Boolean</code>
	 */
	public void setTableUseBandingRowsStylesAttribute( Boolean tableUseBandingRowsStylesValue )
	{
		TableUseBandingRowsStylesAttribute attr =  new TableUseBandingRowsStylesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableUseBandingRowsStylesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableUseBandingColumnsStylesAttribute</code> , See {@odf.attribute table:use-banding-columns-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableUseBandingColumnsStylesAttribute()
	{
		TableUseBandingColumnsStylesAttribute attr = (TableUseBandingColumnsStylesAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "use-banding-columns-styles" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableUseBandingColumnsStylesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableUseBandingColumnsStylesAttribute</code> , See {@odf.attribute table:use-banding-columns-styles}
	 *
	 * @param tableUseBandingColumnsStylesValue   The type is <code>Boolean</code>
	 */
	public void setTableUseBandingColumnsStylesAttribute( Boolean tableUseBandingColumnsStylesValue )
	{
		TableUseBandingColumnsStylesAttribute attr =  new TableUseBandingColumnsStylesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableUseBandingColumnsStylesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableProtectedAttribute</code> , See {@odf.attribute table:protected}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableProtectedAttribute()
	{
		TableProtectedAttribute attr = (TableProtectedAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "protected" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableProtectedAttribute</code> , See {@odf.attribute table:protected}
	 *
	 * @param tableProtectedValue   The type is <code>Boolean</code>
	 */
	public void setTableProtectedAttribute( Boolean tableProtectedValue )
	{
		TableProtectedAttribute attr =  new TableProtectedAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableProtectedValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableProtectionKeyAttribute</code> , See {@odf.attribute table:protection-key}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableProtectionKeyAttribute()
	{
		TableProtectionKeyAttribute attr = (TableProtectionKeyAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "protection-key" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableProtectionKeyAttribute</code> , See {@odf.attribute table:protection-key}
	 *
	 * @param tableProtectionKeyValue   The type is <code>String</code>
	 */
	public void setTableProtectionKeyAttribute( String tableProtectionKeyValue )
	{
		TableProtectionKeyAttribute attr =  new TableProtectionKeyAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableProtectionKeyValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableProtectionKeyDigestAlgorithmAttribute</code> , See {@odf.attribute table:protection-key-digest-algorithm}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableProtectionKeyDigestAlgorithmAttribute()
	{
		TableProtectionKeyDigestAlgorithmAttribute attr = (TableProtectionKeyDigestAlgorithmAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "protection-key-digest-algorithm" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return TableProtectionKeyDigestAlgorithmAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableProtectionKeyDigestAlgorithmAttribute</code> , See {@odf.attribute table:protection-key-digest-algorithm}
	 *
	 * @param tableProtectionKeyDigestAlgorithmValue   The type is <code>String</code>
	 */
	public void setTableProtectionKeyDigestAlgorithmAttribute( String tableProtectionKeyDigestAlgorithmValue )
	{
		TableProtectionKeyDigestAlgorithmAttribute attr =  new TableProtectionKeyDigestAlgorithmAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableProtectionKeyDigestAlgorithmValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TablePrintAttribute</code> , See {@odf.attribute table:print}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTablePrintAttribute()
	{
		TablePrintAttribute attr = (TablePrintAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "print" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TablePrintAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TablePrintAttribute</code> , See {@odf.attribute table:print}
	 *
	 * @param tablePrintValue   The type is <code>Boolean</code>
	 */
	public void setTablePrintAttribute( Boolean tablePrintValue )
	{
		TablePrintAttribute attr =  new TablePrintAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tablePrintValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TablePrintRangesAttribute</code> , See {@odf.attribute table:print-ranges}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTablePrintRangesAttribute()
	{
		TablePrintRangesAttribute attr = (TablePrintRangesAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "print-ranges" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TablePrintRangesAttribute</code> , See {@odf.attribute table:print-ranges}
	 *
	 * @param tablePrintRangesValue   The type is <code>String</code>
	 */
	public void setTablePrintRangesAttribute( String tablePrintRangesValue )
	{
		TablePrintRangesAttribute attr =  new TablePrintRangesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tablePrintRangesValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.XML), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIsSubTableAttribute</code> , See {@odf.attribute table:is-sub-table}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableIsSubTableAttribute()
	{
		TableIsSubTableAttribute attr = (TableIsSubTableAttribute) getOdfAttribute( OdfName.get( OdfNamespace.get(OdfNamespaceNames.TABLE), "is-sub-table" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TableIsSubTableAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIsSubTableAttribute</code> , See {@odf.attribute table:is-sub-table}
	 *
	 * @param tableIsSubTableValue   The type is <code>Boolean</code>
	 */
	public void setTableIsSubTableAttribute( Boolean tableIsSubTableValue )
	{
		TableIsSubTableAttribute attr =  new TableIsSubTableAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( tableIsSubTableValue.booleanValue() );
	}

	/**
	 * Create child element {@odf.element table:title}.
	 *
	 * @return   return  the element {@odf.element table:title}
	 * DifferentQName 
	 */
	public TableTitleElement newTableTitleElement()
	{
		TableTitleElement  tableTitle = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTitleElement.class);
		this.appendChild( tableTitle);
		return  tableTitle;
	}                   
               
	/**
	 * Create child element {@odf.element table:desc}.
	 *
	 * @return   return  the element {@odf.element table:desc}
	 * DifferentQName 
	 */
	public TableDescElement newTableDescElement()
	{
		TableDescElement  tableDesc = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDescElement.class);
		this.appendChild( tableDesc);
		return  tableDesc;
	}                   
               
	/**
	 * Create child element {@odf.element table:table-source}.
	 *
     * @param xlinkHrefAttributeValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @param xlinkTypeAttributeValue  the <code>String</code> value of <code>XlinkTypeAttribute</code>, see {@odf.attribute  xlink:type} at specification
	 * @return   return  the element {@odf.element table:table-source}
	 * DifferentQName 
	 */
    
	public TableTableSourceElement newTableTableSourceElement(String xlinkHrefAttributeValue, String xlinkTypeAttributeValue)
	{
		TableTableSourceElement  tableTableSource = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableSourceElement.class);
		tableTableSource.setXlinkHrefAttribute( xlinkHrefAttributeValue );
		tableTableSource.setXlinkTypeAttribute( xlinkTypeAttributeValue );
		this.appendChild( tableTableSource);
		return  tableTableSource;      
	}
    
	/**
	 * Create child element {@odf.element office:dde-source}.
	 *
     * @param officeDdeApplicationAttributeValue  the <code>String</code> value of <code>OfficeDdeApplicationAttribute</code>, see {@odf.attribute  office:dde-application} at specification
	 * @param officeDdeItemAttributeValue  the <code>String</code> value of <code>OfficeDdeItemAttribute</code>, see {@odf.attribute  office:dde-item} at specification
	 * @param officeDdeTopicAttributeValue  the <code>String</code> value of <code>OfficeDdeTopicAttribute</code>, see {@odf.attribute  office:dde-topic} at specification
	 * @return   return  the element {@odf.element office:dde-source}
	 * DifferentQName 
	 */
    
	public OfficeDdeSourceElement newOfficeDdeSourceElement(String officeDdeApplicationAttributeValue, String officeDdeItemAttributeValue, String officeDdeTopicAttributeValue)
	{
		OfficeDdeSourceElement  officeDdeSource = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeDdeSourceElement.class);
		officeDdeSource.setOfficeDdeApplicationAttribute( officeDdeApplicationAttributeValue );
		officeDdeSource.setOfficeDdeItemAttribute( officeDdeItemAttributeValue );
		officeDdeSource.setOfficeDdeTopicAttribute( officeDdeTopicAttributeValue );
		this.appendChild( officeDdeSource);
		return  officeDdeSource;      
	}
    
	/**
	 * Create child element {@odf.element table:scenario}.
	 *
     * @param tableIsActiveAttributeValue  the <code>boolean</code> value of <code>TableIsActiveAttribute</code>, see {@odf.attribute  table:is-active} at specification
	 * @param tableScenarioRangesAttributeValue  the <code>String</code> value of <code>TableScenarioRangesAttribute</code>, see {@odf.attribute  table:scenario-ranges} at specification
	 * @return   return  the element {@odf.element table:scenario}
	 * DifferentQName 
	 */
    
	public TableScenarioElement newTableScenarioElement(boolean tableIsActiveAttributeValue, String tableScenarioRangesAttributeValue)
	{
		TableScenarioElement  tableScenario = ((OdfFileDom)this.ownerDocument).newOdfElement(TableScenarioElement.class);
		tableScenario.setTableIsActiveAttribute( Boolean.valueOf(tableIsActiveAttributeValue) );
		tableScenario.setTableScenarioRangesAttribute( tableScenarioRangesAttributeValue );
		this.appendChild( tableScenario);
		return  tableScenario;      
	}
    
	/**
	 * Create child element {@odf.element form:form}.
	 *
	 * @return   return  the element {@odf.element form:form}
	 * DifferentQName 
	 */
	public FormFormElement newFormFormElement()
	{
		FormFormElement  formForm = ((OdfFileDom)this.ownerDocument).newOdfElement(FormFormElement.class);
		this.appendChild( formForm);
		return  formForm;
	}                   
               
	/**
	 * Create child element {@odf.element xforms:model}.
	 *
	 * @return   return  the element {@odf.element xforms:model}
	 * DifferentQName 
	 */
	public XformsModelElement newXformsModelElement()
	{
		XformsModelElement  xformsModel = ((OdfFileDom)this.ownerDocument).newOdfElement(XformsModelElement.class);
		this.appendChild( xformsModel);
		return  xformsModel;
	}                   
               
	/**
	 * Create child element {@odf.element table:shapes}.
	 *
	 * @return   return  the element {@odf.element table:shapes}
	 * DifferentQName 
	 */
	public TableShapesElement newTableShapesElement()
	{
		TableShapesElement  tableShapes = ((OdfFileDom)this.ownerDocument).newOdfElement(TableShapesElement.class);
		this.appendChild( tableShapes);
		return  tableShapes;
	}                   
               
	/**
	 * Create child element {@odf.element table:table-column-group}.
	 *
	 * @return   return  the element {@odf.element table:table-column-group}
	 * DifferentQName 
	 */
	public TableTableColumnGroupElement newTableTableColumnGroupElement()
	{
		TableTableColumnGroupElement  tableTableColumnGroup = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableColumnGroupElement.class);
		this.appendChild( tableTableColumnGroup);
		return  tableTableColumnGroup;
	}                   
               
	/**
	 * Create child element {@odf.element table:table-columns}.
	 *
	 * @return   return  the element {@odf.element table:table-columns}
	 * DifferentQName 
	 */
	public TableTableColumnsElement newTableTableColumnsElement()
	{
		TableTableColumnsElement  tableTableColumns = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableColumnsElement.class);
		this.appendChild( tableTableColumns);
		return  tableTableColumns;
	}                   
               
	/**
	 * Create child element {@odf.element table:table-column}.
	 *
	 * @return   return  the element {@odf.element table:table-column}
	 * DifferentQName 
	 */
	public TableTableColumnElement newTableTableColumnElement()
	{
		TableTableColumnElement  tableTableColumn = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableColumnElement.class);
		this.appendChild( tableTableColumn);
		return  tableTableColumn;
	}                   
               
	/**
	 * Create child element {@odf.element table:table-header-columns}.
	 *
	 * @return   return  the element {@odf.element table:table-header-columns}
	 * DifferentQName 
	 */
	public TableTableHeaderColumnsElement newTableTableHeaderColumnsElement()
	{
		TableTableHeaderColumnsElement  tableTableHeaderColumns = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableHeaderColumnsElement.class);
		this.appendChild( tableTableHeaderColumns);
		return  tableTableHeaderColumns;
	}                   
               
	/**
	 * Create child element {@odf.element table:table-row-group}.
	 *
	 * @return   return  the element {@odf.element table:table-row-group}
	 * DifferentQName 
	 */
	public TableTableRowGroupElement newTableTableRowGroupElement()
	{
		TableTableRowGroupElement  tableTableRowGroup = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableRowGroupElement.class);
		this.appendChild( tableTableRowGroup);
		return  tableTableRowGroup;
	}                   
               
	/**
	 * Create child element {@odf.element table:table-rows}.
	 *
	 * @return   return  the element {@odf.element table:table-rows}
	 * DifferentQName 
	 */
	public TableTableRowsElement newTableTableRowsElement()
	{
		TableTableRowsElement  tableTableRows = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableRowsElement.class);
		this.appendChild( tableTableRows);
		return  tableTableRows;
	}                   
               
	/**
	 * Create child element {@odf.element text:soft-page-break}.
	 *
	 * @return   return  the element {@odf.element text:soft-page-break}
	 * DifferentQName 
	 */
	public TextSoftPageBreakElement newTextSoftPageBreakElement()
	{
		TextSoftPageBreakElement  textSoftPageBreak = ((OdfFileDom)this.ownerDocument).newOdfElement(TextSoftPageBreakElement.class);
		this.appendChild( textSoftPageBreak);
		return  textSoftPageBreak;
	}                   
               
	/**
	 * Create child element {@odf.element table:table-row}.
	 *
	 * @return   return  the element {@odf.element table:table-row}
	 * DifferentQName 
	 */
	public TableTableRowElement newTableTableRowElement()
	{
		TableTableRowElement  tableTableRow = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableRowElement.class);
		this.appendChild( tableTableRow);
		return  tableTableRow;
	}                   
               
	/**
	 * Create child element {@odf.element table:table-header-rows}.
	 *
	 * @return   return  the element {@odf.element table:table-header-rows}
	 * DifferentQName 
	 */
	public TableTableHeaderRowsElement newTableTableHeaderRowsElement()
	{
		TableTableHeaderRowsElement  tableTableHeaderRows = ((OdfFileDom)this.ownerDocument).newOdfElement(TableTableHeaderRowsElement.class);
		this.appendChild( tableTableHeaderRows);
		return  tableTableHeaderRows;
	}                   
               
	/**
	 * Create child element {@odf.element table:named-expressions}.
	 *
	 * @return   return  the element {@odf.element table:named-expressions}
	 * DifferentQName 
	 */
	public TableNamedExpressionsElement newTableNamedExpressionsElement()
	{
		TableNamedExpressionsElement  tableNamedExpressions = ((OdfFileDom)this.ownerDocument).newOdfElement(TableNamedExpressionsElement.class);
		this.appendChild( tableNamedExpressions);
		return  tableNamedExpressions;
	}                   
               
}
