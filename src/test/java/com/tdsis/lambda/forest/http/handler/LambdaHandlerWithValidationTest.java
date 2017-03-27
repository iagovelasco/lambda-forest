package com.tdsis.lambda.forest.http.handler;

import javax.validation.Valid;

import com.amazonaws.services.lambda.runtime.Context;
import com.tdsis.lambda.forest.http.exception.HttpException;

public class LambdaHandlerWithValidationTest extends AbstractRequestHandler<UserRequestTest, UserResponseTest> {

    @Override
    public void before(Context context) throws HttpException {
        
    }

    @Override
    public UserResponseTest execute(@Valid UserRequestTest input, Context context) throws HttpException {

        return null;
    }

}
