package com.toys.toytroc.facade.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.toys.toytroc.facade.model.ModelApiResponse;
import com.toys.toytroc.facade.model.ToyVO;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-26T13:16:13.014Z")

@Controller
public class ToyApiController implements ToyApi {

    private static final Logger log = LoggerFactory.getLogger(ToyApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ToyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteToy(@ApiParam(value = "ToyVO id to delete",required=true) @PathVariable("toyId") Long toyId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ToyVO> getToyById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("toyId") Long toyId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<ToyVO>(objectMapper.readValue("<ToyVO>  <id>123456789</id>  <name>doggie</name>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status></ToyVO>", ToyVO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<ToyVO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ToyVO>(objectMapper.readValue("{  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"name\" : \"doggie\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"}", ToyVO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ToyVO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ToyVO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateToy(@ApiParam(value = "ToyVO object that needs to be added to the store" ,required=true )  @Valid @RequestBody ToyVO body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of toy to update",required=true) @PathVariable("toyId") Long toyId, @ApiParam(value = "Additional data to pass to server") @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata, @ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
