/**
 * A control class that provide the method back to the pages where it comes from
 * @author Jingyuan Tang
 * @version 3.2
 * @since 5/20/2021
 */
public class backToCertainPage{
    
    int sourcePage;

    public void backPage(int sourcePage){
        switch (sourcePage){
            case 1:
                new digitalWorkOutVideosPage_0();
            break;
            case 2:
                new membershipGUI().init();
            break;
            case 3:
                new LivePersonalTrainingPage();
            break;
            case 4:
                new Welcome();
            break;
        }
    }
    
}