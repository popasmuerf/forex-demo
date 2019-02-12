package io.thirdplanet.forex.forexdemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;


/**
 * Annotations
 * -------------------------
 * @Entity: Specifices that the class is an entity. This annotation is
 * applied to entity classes....
 *
 *
 *
 *
 *
 *
 * @Id: Specifies an attribute.  We are not going to
 * to auto increment this value......
 *
 */

@Entity
public class ExchangeValue {
    @Id
    private Long id ;

    @Column(name="currency_from")
    private String from ;


    @Column(name="currency_to")
    private String to ;


    private BigDecimal conversionMultiple ;

    private int port ;


    public ExchangeValue(){
        //empty constructor
    }//end constructor



    public ExchangeValue(Long id,
                         String from,
                         String to,
                         BigDecimal conversionMultiple ){
        super() ;
        this.id = id ;
        this.from = from ;
        this .to = to ;
        this.conversionMultiple = conversionMultiple ;


    }//end constructor



    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }



}//end of class
