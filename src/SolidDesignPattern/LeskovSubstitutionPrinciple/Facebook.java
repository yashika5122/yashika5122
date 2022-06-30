package SolidDesignPattern.LeskovSubstitutionPrinciple;

/* FaceBook Support all the methods of base class so it can be replacement for base class and follow LSP */
public class Facebook extends SocialMedia{
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

    }
}
