
public class backToCertainPage{
    
    int sourcePage;

    public void setSourcePage (int pageNum){
        sourcePage = pageNum;
    }

    public int getSourcePage (){
        int num = sourcePage;
        return num;
    }

    public void backPage(int sourcePage){
        switch (sourcePage){
            case 1:
                new digitalWorkOutVideosPage();
            break;
            case 2:
                new membershipMatch();
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