
package stackexchange;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Question", targetNamespace = "http://stackexchangews/", wsdlLocation = "http://localhost:8080/StackExchange_WS2/Question?wsdl")
public class Question_Service
    extends Service
{

    private final static URL QUESTION_WSDL_LOCATION;
    private final static WebServiceException QUESTION_EXCEPTION;
    private final static QName QUESTION_QNAME = new QName("http://stackexchangews/", "Question");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/StackExchange_WS2/Question?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        QUESTION_WSDL_LOCATION = url;
        QUESTION_EXCEPTION = e;
    }

    public Question_Service() {
        super(__getWsdlLocation(), QUESTION_QNAME);
    }

    public Question_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), QUESTION_QNAME, features);
    }

    public Question_Service(URL wsdlLocation) {
        super(wsdlLocation, QUESTION_QNAME);
    }

    public Question_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, QUESTION_QNAME, features);
    }

    public Question_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Question_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns QuestionWS
     */
    @WebEndpoint(name = "QuestionWSPort")
    public QuestionWS getQuestionWSPort() {
        return super.getPort(new QName("http://stackexchangews/", "QuestionWSPort"), QuestionWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QuestionWS
     */
    @WebEndpoint(name = "QuestionWSPort")
    public QuestionWS getQuestionWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://stackexchangews/", "QuestionWSPort"), QuestionWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (QUESTION_EXCEPTION!= null) {
            throw QUESTION_EXCEPTION;
        }
        return QUESTION_WSDL_LOCATION;
    }

}