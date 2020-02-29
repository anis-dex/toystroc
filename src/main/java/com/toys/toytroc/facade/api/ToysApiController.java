package com.toys.toytroc.facade.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toys.toytroc.business.ToyTrocException;
import com.toys.toytroc.business.toys.IToysManagement;
import com.toys.toytroc.business.toys.model.Toy;
import com.toys.toytroc.business.toys.model.ToyCategory;
import com.toys.toytroc.facade.model.CategoryVO;
import com.toys.toytroc.facade.model.ToyVO;
import io.swagger.annotations.ApiParam;
import com.toys.toytroc.facade.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-26T13:16:13.014Z")


@Controller
public class ToysApiController implements ToysApi {

    private static final Logger log = LoggerFactory.getLogger(ToysApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private IToysManagement toysManagement;

    @Autowired
    public ToysApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteOrder(@Min(1L)@ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ToyVO>> findToys(@ApiParam(value = "toys search criteria",required=true) @PathVariable("searchCriteria") List<String> searchCriteria) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<ToyVO>>(objectMapper.readValue("<ToyVO>  <id>123456789</id>  <name>doggie</name>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status></ToyVO>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<ToyVO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ToyVO>>(objectMapper.readValue("[ {  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"name\" : \"doggie\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"}, {  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"name\" : \"doggie\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ToyVO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ToyVO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> getOrderById(@Min(1L) @Max(10L) @ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("<Order>  <id>123456789</id>  <petId>123456789</petId>  <quantity>123</quantity>  <shipDate>2000-01-23T04:56:07.000Z</shipDate>  <status>aeiou</status>  <complete>true</complete></Order>", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{  \"petId\" : 6,  \"quantity\" : 1,  \"id\" : 0,  \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"complete\" : false,  \"status\" : \"placed\"}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    @CrossOrigin("*")
    public ResponseEntity getToys(@ApiParam(value = "the  userId of the user who requested the list of toys" ,required=true) @RequestHeader(value="userId", required=true) String userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {

                return new ResponseEntity<List<ToyVO>>(objectMapper.readValue("<ToyVO>  <id>123456789</id>  <name>doggie</name>  <photoUrls>    <photoUrls>aeiou</photoUrls>  </photoUrls>  <tags>  </tags>  <status>aeiou</status></ToyVO>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (JsonProcessingException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<ToyVO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                List<Toy> availableToys = toysManagement.getAvailableToys();
                if(CollectionUtils.isEmpty(availableToys)) {
                    return ResponseEntity.notFound().build();
                } else {
                    List<ToyVO> toys = availableToys.stream().map(toy -> {
                        ToyVO toyVO = new ToyVO();
                        toyVO.setId(toy.getId());
                        toyVO.setName(toy.getName());
                        if(toy.getStatus() != null) {
                            toyVO.setStatus(ToyVO.StatusEnum.valueOf(toy.getStatus().name()));
                        }
                        ToyCategory category = toy.getCategory();
                        if(category != null) {
                            CategoryVO categoryVO = new CategoryVO();
                            BeanUtils.copyProperties(category, categoryVO);
                            toyVO.setCategoryVO(categoryVO);
                        }

                        if(!CollectionUtils.isEmpty(toy.getPhotoUrls())) {
                            toyVO.setPhotoUrls(toy.getPhotoUrls().stream().map(photo -> {
                                return photo.getPath();
                            }).collect(Collectors.toList()));
                        }
                        return toyVO;
                    }).collect(Collectors.toList());
                    return ResponseEntity.ok(toys);
                }
                //return new ResponseEntity<List<ToyVO>>(objectMapper.readValue("[ {  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"name\" : \"doggie\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"}, {  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],  \"name\" : \"doggie\",  \"id\" : 0,  \"category\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"tags\" : [ {    \"name\" : \"name\",    \"id\" : 1  }, {    \"name\" : \"name\",    \"id\" : 1  } ],  \"status\" : \"available\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (ToyTrocException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ToyVO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ToyVO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Order body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("<Order>  <id>123456789</id>  <petId>123456789</petId>  <quantity>123</quantity>  <shipDate>2000-01-23T04:56:07.000Z</shipDate>  <status>aeiou</status>  <complete>true</complete></Order>", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{  \"petId\" : 6,  \"quantity\" : 1,  \"id\" : 0,  \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"complete\" : false,  \"status\" : \"placed\"}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

}
