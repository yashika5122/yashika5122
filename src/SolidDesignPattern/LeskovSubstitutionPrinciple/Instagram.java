package SolidDesignPattern.LeskovSubstitutionPrinciple;

public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall() {
        //Not supported , So cannot be replacement for base class SocialMedia
    }
}
