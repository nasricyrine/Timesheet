package com.demo.timesheet.Service;

import com.demo.timesheet.domain.User;
import com.demo.timesheet.exception.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;
@Service
public interface UserService {
    User register(String firstName, String lastName, String username, String email)
            throws UserNotFoundException, EmailExistException, UsernameExistException, MessagingException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);

    User addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNonLocked,
                    boolean isActive, MultipartFile profileImage) throws UserNotFoundException, EmailExistException,
            UsernameExistException, MessagingException, IOException, NotAnImageFileException;

    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername,
                    String newEmail, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage)
            throws UserNotFoundException, EmailExistException, UsernameExistException, IOException,
            NotAnImageFileException;

    void deleteUser(String username) throws IOException;

    void resetPassword(String email) throws MessagingException, EmailNotFoundException;

    User updateProfileImage(String username, MultipartFile profileImage) throws UserNotFoundException,
            EmailExistException, UsernameExistException, IOException, NotAnImageFileException;

    User resetProfileImage(String username) throws UserNotFoundException, EmailExistException, UsernameExistException;

}
