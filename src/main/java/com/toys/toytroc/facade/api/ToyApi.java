/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.9).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.toys.toytroc.facade.api;

import com.toys.toytroc.facade.model.ModelApiResponse;
import com.toys.toytroc.facade.model.ToyVO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-26T13:16:13.014Z")

@Api(value = "toy", description = "the toy API")
public interface ToyApi {

    @ApiOperation(value = "Deletes a toy", nickname = "deleteToy", notes = "", authorizations = {
        @Authorization(value = "toystore_auth", scopes = {
            @AuthorizationScope(scope = "read:toys", description = "read your pets"),
            @AuthorizationScope(scope = "write:toys", description = "modify pets in your account")
            })
    }, tags={ "toys", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    @RequestMapping(value = "/toy/{toyId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteToy(@ApiParam(value = "ToyVO id to delete", required = true) @PathVariable("toyId") Long toyId, @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey);


    @ApiOperation(value = "Find toy by ID", nickname = "getToyById", notes = "Returns a single pet", response = ToyVO.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "toys", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ToyVO.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    @RequestMapping(value = "/toy/{toyId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ToyVO> getToyById(@ApiParam(value = "ID of pet to return", required = true) @PathVariable("toyId") Long toyId);


    @ApiOperation(value = "add or update a toy in the store", nickname = "updateToy", notes = "", authorizations = {
        @Authorization(value = "toystore_auth", scopes = {
            @AuthorizationScope(scope = "read:toys", description = "read your pets"),
            @AuthorizationScope(scope = "write:toys", description = "modify pets in your account")
            })
    }, tags={ "toys", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "ToyVO not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/toy",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateToy(@ApiParam(value = "ToyVO object that needs to be added to the store", required = true) @Valid @RequestBody ToyVO body);


    @ApiOperation(value = "uploads an image", nickname = "uploadFile", notes = "", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "toystore_auth", scopes = {
            @AuthorizationScope(scope = "read:toys", description = "read your pets"),
            @AuthorizationScope(scope = "write:toys", description = "modify pets in your account")
            })
    }, tags={ "toys", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class) })
    @RequestMapping(value = "/toy/{toyId}/image",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of toy to update", required = true) @PathVariable("toyId") Long toyId, @ApiParam(value = "Additional data to pass to server") @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata, @ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file);

}