package io.thirdplanet.forex.forexdemo.controllers;

import io.thirdplanet.forex.forexdemo.entities.ExchangeValue;
import io.thirdplanet.forex.forexdemo.repositories.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController public class ForexController:
 * ----------------------------------------------
 * Create a Contrller to expose a Rest Service
 *
 * @Autowired private Enviroment enviroment  :
 * -----------------------------------------------
 * We would want to return the server port back.  This will help
 * us indentify which instance service is giving the response back.
 *
 * @Autowired private ExchangeValueRepository repository:
 * -----------------------------------------------------
 * Autowire this repository.....
 *
 * ExchangeValue exchangeValue = repository.findByFromAndTo(String from, String to);
 * ---------------------------------------------------------------
 * Get the exchange value from the database
 *
 *
 * exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port"))
 *--------------------------------------------------------------------------------
 * Get the oport from enviroment and set it into the response bean
 *
 *
 */


@RestController
public class ForexController {
    @Autowired
    private Environment environment; ;

    @Autowired
    private ExchangeValueRepository exchangeValueRepository ;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue ;
    }


}
