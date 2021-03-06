
package stackexchange;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "QuestionWS", targetNamespace = "http://stackexchangews/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QuestionWS {


    /**
     * 
     * @param qid
     * @return
     *     returns stackexchange.Question
     */
    @WebMethod
    @WebResult(name = "question", targetNamespace = "")
    @RequestWrapper(localName = "getQuestionByID", targetNamespace = "http://stackexchangews/", className = "stackexchange.GetQuestionByID")
    @ResponseWrapper(localName = "getQuestionByIDResponse", targetNamespace = "http://stackexchangews/", className = "stackexchange.GetQuestionByIDResponse")
    @Action(input = "http://stackexchangews/QuestionWS/getQuestionByIDRequest", output = "http://stackexchangews/QuestionWS/getQuestionByIDResponse")
    public Question getQuestionByID(
        @WebParam(name = "qid", targetNamespace = "")
        int qid);

    /**
     * 
     * @return
     *     returns java.util.List<stackexchange.Question>
     */
    @WebMethod
    @WebResult(name = "listQuestion", targetNamespace = "")
    @RequestWrapper(localName = "getListQuestion", targetNamespace = "http://stackexchangews/", className = "stackexchange.GetListQuestion")
    @ResponseWrapper(localName = "getListQuestionResponse", targetNamespace = "http://stackexchangews/", className = "stackexchange.GetListQuestionResponse")
    @Action(input = "http://stackexchangews/QuestionWS/getListQuestionRequest", output = "http://stackexchangews/QuestionWS/getListQuestionResponse")
    public List<Question> getListQuestion();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://stackexchangews/", className = "stackexchange.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://stackexchangews/", className = "stackexchange.HelloResponse")
    @Action(input = "http://stackexchangews/QuestionWS/helloRequest", output = "http://stackexchangews/QuestionWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
