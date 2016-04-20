
package webPack.serv;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SPSUDegreeDetailWebServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SPSUDegreeDetailWebServiceSoap {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CSBA", action = "http://tempuri.org/CSBA")
    @WebResult(name = "CSBAResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CSBA", targetNamespace = "http://tempuri.org/", className = "webPack.serv.CSBA")
    @ResponseWrapper(localName = "CSBAResponse", targetNamespace = "http://tempuri.org/", className = "webPack.serv.CSBAResponse")
    public String csba();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CSBS", action = "http://tempuri.org/CSBS")
    @WebResult(name = "CSBSResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CSBS", targetNamespace = "http://tempuri.org/", className = "webPack.serv.CSBS")
    @ResponseWrapper(localName = "CSBSResponse", targetNamespace = "http://tempuri.org/", className = "webPack.serv.CSBSResponse")
    public String csbs();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CETBS", action = "http://tempuri.org/CETBS")
    @WebResult(name = "CETBSResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CETBS", targetNamespace = "http://tempuri.org/", className = "webPack.serv.CETBS")
    @ResponseWrapper(localName = "CETBSResponse", targetNamespace = "http://tempuri.org/", className = "webPack.serv.CETBSResponse")
    public String cetbs();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ITBS", action = "http://tempuri.org/ITBS")
    @WebResult(name = "ITBSResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ITBS", targetNamespace = "http://tempuri.org/", className = "webPack.serv.ITBS")
    @ResponseWrapper(localName = "ITBSResponse", targetNamespace = "http://tempuri.org/", className = "webPack.serv.ITBSResponse")
    public String itbs();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SWEBS", action = "http://tempuri.org/SWEBS")
    @WebResult(name = "SWEBSResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SWEBS", targetNamespace = "http://tempuri.org/", className = "webPack.serv.SWEBS")
    @ResponseWrapper(localName = "SWEBSResponse", targetNamespace = "http://tempuri.org/", className = "webPack.serv.SWEBSResponse")
    public String swebs();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CSMS", action = "http://tempuri.org/CSMS")
    @WebResult(name = "CSMSResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CSMS", targetNamespace = "http://tempuri.org/", className = "webPack.serv.CSMS")
    @ResponseWrapper(localName = "CSMSResponse", targetNamespace = "http://tempuri.org/", className = "webPack.serv.CSMSResponse")
    public String csms();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ITMS", action = "http://tempuri.org/ITMS")
    @WebResult(name = "ITMSResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ITMS", targetNamespace = "http://tempuri.org/", className = "webPack.serv.ITMS")
    @ResponseWrapper(localName = "ITMSResponse", targetNamespace = "http://tempuri.org/", className = "webPack.serv.ITMSResponse")
    public String itms();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SWEMS", action = "http://tempuri.org/SWEMS")
    @WebResult(name = "SWEMSResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SWEMS", targetNamespace = "http://tempuri.org/", className = "webPack.serv.SWEMS")
    @ResponseWrapper(localName = "SWEMSResponse", targetNamespace = "http://tempuri.org/", className = "webPack.serv.SWEMSResponse")
    public String swems();

}
