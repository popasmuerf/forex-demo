package io.thirdplanet.forex.forexdemo.repositories;

import io.thirdplanet.forex.forexdemo.entities.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


/**
 * "public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long" :
 * ---------------------------------------------------------------------------------------
 *
 * We are extending JpaRepository using two generics..."ExchangeValue" & "Long"
 * ExchangeValue is the entitry that is being managged and the primary
 * key of type 'ExchangeValue' is of type 'Long'
 *
 *
 *
 * ExchangeValue findByFromAntTo(String from, String to);
 *
 * will be used by our controller(really we want this to be done via a
 * service object....that is then used by a Controller...as we want to
 * de-couple components a much as possible.......because seperation of
 * concerns is important....)
 *
 *
 */

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
  ExchangeValue findByFromAndTo(String from, String to);
}
