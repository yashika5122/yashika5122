package SolidDesignPattern.LeskovSubstitutionPrinciple.Solution;
/*Methods of Interface is abstract by default  */

/* To solve the previous problem where all class do not support the LSP, we will create different interface
 * so that we can resolve this */

public interface SocialMedia {

    //@support WhatsApp, faceBook and instagram
    public void chatWithFriend();

    //@support WhatsApp, faceBook and instagram
    public void sendPhotosAndVideos();
}
