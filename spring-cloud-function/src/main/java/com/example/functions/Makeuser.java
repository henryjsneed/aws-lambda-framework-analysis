package com.example.functions;

import com.example.models.User;
import com.example.repositories.UserRepository;
import com.example.request.APIGatewayRequest;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.UUID;
import java.util.function.Function;

@SuppressWarnings("unused")
@Component
public class Makeuser implements Function<APIGatewayRequest, User> {

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(Makeuser.class);

    @Override
    public User apply(APIGatewayRequest request) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        User userEntity = modelMapper.map(request.getUserRequest(), User.class);
        userEntity.setId(UUID.randomUUID().toString());
        logger.info("Saving entity to database");
        User user = userRepository.save(userEntity);
        logger.info("Successfully saved user to database" + user);
        return user;
    }
}