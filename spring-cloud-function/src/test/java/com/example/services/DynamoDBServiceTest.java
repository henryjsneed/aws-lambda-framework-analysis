//package com.example.services;
//
//import com.example.models.User;
//import com.example.repositories.UserRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.MockitoAnnotations.openMocks;
//
////@SpringBootTest
//@DataJpaTest
//class DynamoDBServiceTest {
//
//    @Mock
//    private UserRepository repo;
//
//    private DynamoDBService underTest;
//
//    @BeforeEach
//    void setUp() {
//        openMocks(this);
//        underTest = new DynamoDBService();
//    }
//    @Test
//    void amazonDynamoDB() {
//        User user = new User("22231", "userFirst", "userLast", "user@gmail.com", 21);
//        User response = repo.save(user);
//        assertEquals(user.getFirstName(), response.getFirstName());
//    }
//}