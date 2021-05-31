/**
 * A control class that provide the method back to the pages where it comes from
 * @author Jingyuan Tang
 * @version 3.2
 * @since 4/20/2021
 */
public class backToCertainPage{
    
    int sourcePage;

    /**
     * Determine where the page turn back to (the source page).
     * @param sourcePage the source page of int type.
     **/
    public void backPage(int sourcePage){
        switch (sourcePage){
            case 1:
                new digitalWorkOutVideosPage();
            break;
            case 2:
                new membershipGUI().init(2);
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