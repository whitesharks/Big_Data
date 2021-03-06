package com.hbase;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import net.java.dev.jaxb.array.StringArray;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "GenCheGuanLianDelegate", targetNamespace = "http://hbase.com/")
public interface GenCheGuanLianDelegate {

	/**
	 * 
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<com.hbase.Result>
	 */
	@WebMethod(operationName = "QueryByTimeAndChepaiAndKkbhs")
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "QueryByTimeAndChepaiAndKkbhs", targetNamespace = "http://hbase.com/", className = "com.hbase.QueryByTimeAndChepaiAndKkbhs")
	@ResponseWrapper(localName = "QueryByTimeAndChepaiAndKkbhsResponse", targetNamespace = "http://hbase.com/", className = "com.hbase.QueryByTimeAndChepaiAndKkbhsResponse")
	public List<Result> queryByTimeAndChepaiAndKkbhs(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") XMLGregorianCalendar arg1,
			@WebParam(name = "arg2", targetNamespace = "") XMLGregorianCalendar arg2,
			@WebParam(name = "arg3", targetNamespace = "") List<String> arg3);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @return returns java.util.List<net.java.dev.jaxb.array.StringArray>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "genCheGuanLianFenXi", targetNamespace = "http://hbase.com/", className = "com.hbase.GenCheGuanLianFenXi")
	@ResponseWrapper(localName = "genCheGuanLianFenXiResponse", targetNamespace = "http://hbase.com/", className = "com.hbase.GenCheGuanLianFenXiResponse")
	public List<StringArray> genCheGuanLianFenXi(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") int arg2,
			@WebParam(name = "arg3", targetNamespace = "") XMLGregorianCalendar arg3,
			@WebParam(name = "arg4", targetNamespace = "") XMLGregorianCalendar arg4,
			@WebParam(name = "arg5", targetNamespace = "") List<String> arg5,
			@WebParam(name = "arg6", targetNamespace = "") int arg6);

}
