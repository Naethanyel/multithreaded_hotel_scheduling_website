package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.model.response.TimeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
@CrossOrigin
public class TimeController {
    @RequestMapping(path="", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TimeResponse> getTimeResponse(){
        return new ResponseEntity<>(new TimeResponse(), HttpStatus.OK);
    }
}
