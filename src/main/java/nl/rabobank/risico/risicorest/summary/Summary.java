package nl.rabobank.risico.risicorest.summary;

import lombok.Data;

/**
 * Created by sjoerdadema on 11/07/2017.
 */
@Data
public class Summary {

    String naam;

    public Summary() {
    }

    public Summary(String naam) {
        this.naam = naam;
    }
}
