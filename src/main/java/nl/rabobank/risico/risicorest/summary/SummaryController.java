package nl.rabobank.risico.risicorest.summary;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sjoerdadema on 06/07/2017.
 */
@RestController
@RequestMapping("/api")
public class SummaryController {

    @Autowired
    public SummaryService summaryService;

    @RequestMapping("test")
    public ResponseEntity<?> test() {
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

    @GetMapping("advice/insurances/risigo/summary")
    public ResponseEntity<?> getSummary(@RequestParam(name = "SiebelID") Integer siebelId) {
        System.out.println("SiebelID: " + siebelId);
        ResponseEntity<?> responseEntity;
        try {
            responseEntity = new ResponseEntity(summaryService.getSummary(siebelId), HttpStatus.OK);
        } catch (JsonProcessingException e) {
            responseEntity = new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
}
