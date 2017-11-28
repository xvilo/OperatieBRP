/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.domain.expressie;

/**
 * Representeert niet-literal (niet-constante) expressies.
 */
public interface NonLiteralExpressie extends Expressie {

    @Override
    default boolean isConstanteWaarde() {
        return false;
    }
}