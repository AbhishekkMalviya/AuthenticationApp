package in.abhishek.malviya.authify.controller;

import in.abhishek.malviya.authify.io.ProfileRequest;
import in.abhishek.malviya.authify.io.ProfileResponse;
import in.abhishek.malviya.authify.service.ProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileResponse register(@Valid @RequestBody ProfileRequest request){
         ProfileResponse response = profileService.createProfile(request);
         // ToDo : Send welcome email;
        return response;
    }
}
