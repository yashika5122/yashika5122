package SolidDesignPattern.LeskovSubstitutionPrinciple;

/* This SocialMedia class has some method which is not supported by all inherited call
 * example groupVideoCall is not supported by instagram, so instagram can not be follow LSP
 * */
public abstract class SocialMedia {

    //@support WhatsApp, faceBook and instagram
    public abstract void chatWithFriend();

    //@support faceBook and instagram
    public abstract void publishPost();

    //@support WhatsApp, faceBook and instagram
    public abstract void sendPhotosAndVideos();

    //@support WhatsApp and faceBook
    public abstract void groupVideoCall();
}
