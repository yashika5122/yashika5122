package SolidDesignPattern.LeskovSubstitutionPrinciple;

public class WhatsApp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost() {
    //Not supported , So cannot be replacement for base class SocialMedia
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall() {

    }
}
