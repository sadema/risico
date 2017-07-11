package nl.rabobank.risico.risicorest.summary;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

/**
 * Created by sjoerdadema on 11/07/2017.
 */
@Service
public class SummaryService {

    public String getSummary(Integer siebelId) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Summary summary = new Summary("the summary of " + siebelId);
        return objectMapper.writeValueAsString(summary);
    }

}
