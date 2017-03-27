package com.tdsis.lambda.forest.json;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tdsis.lambda.forest.http.ResponseBodySerializerStrategy;
import com.tdsis.lambda.forest.http.exception.HttpException;
import com.tdsis.lambda.forest.http.exception.InternalServerErrorException;

/**
 * The JSON response body serializer strategy
 * 
 * @author nmelo
 * @version 1.0.0
 * @since 1.0.0
 */
public class JsonResponseBodySerializerStrategy implements ResponseBodySerializerStrategy {
        
    @Override
    public String serialize(Object entity) throws HttpException {
        String json = null;
        
        try {
            
            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(Include.NON_NULL);
            json = mapper.writeValueAsString(entity);   
            
        } catch (JsonProcessingException e) {           
            throw new InternalServerErrorException(e.getMessage(), e);      
        }
        
        return json;
    }

}
