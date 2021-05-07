
public class backToCertainPage{
    public int sourcePage;
    public void backPage(int sourcePage){
        switch (sourcePage){
            case 1:
                new digitalWorkOutVideosPage();
            break;
            case 2:
                new membershipMatch();
            break;
            case 3:
                new AppointCoursePage();
            break;
        }
    }
    
}