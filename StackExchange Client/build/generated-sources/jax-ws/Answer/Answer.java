
package Answer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for answer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="answer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_question" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_user" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timepost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "answer", propOrder = {
    "id",
    "idQuestion",
    "idUser",
    "content",
    "timepost"
})
public class Answer {

    protected int id;
    @XmlElement(name = "id_question")
    protected int idQuestion;
    @XmlElement(name = "id_user")
    protected int idUser;
    @XmlElement(required = true)
    protected String content;
    @XmlElement(required = true)
    protected String timepost;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the idQuestion property.
     * 
     */
    public int getIdQuestion() {
        return idQuestion;
    }

    /**
     * Sets the value of the idQuestion property.
     * 
     */
    public void setIdQuestion(int value) {
        this.idQuestion = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the timepost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimepost() {
        return timepost;
    }

    /**
     * Sets the value of the timepost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimepost(String value) {
        this.timepost = value;
    }

}
