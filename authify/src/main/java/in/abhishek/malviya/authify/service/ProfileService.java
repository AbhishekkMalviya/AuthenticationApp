package in.abhishek.malviya.authify.service;

import in.abhishek.malviya.authify.io.ProfileRequest;
import in.abhishek.malviya.authify.io.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest request);
}
