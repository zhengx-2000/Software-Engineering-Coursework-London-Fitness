//存储教练名字和教练的intro
import java.util.ArrayList;

public class Trainer {
    private static ArrayList<String> trainerIntro;
    private static String trainerName;


    /**
	 * Get trainer name
	 * @return trainer name
	 */
	public String getTrainerName() {
		return trainerName;
	}


    /**
	 * Set trainer Name
	 * @param trainerName trainer Name
	 */
	public void setTrainerName(String trainerName) {
		Trainer.trainerName = trainerName;
	}

    /**
	 * Set option contents of fixed items
	 * @param contentone Option contents of fixed items
	 */
	public void setContentOne(ArrayList<String> contentone) {
		Trainer.trainerIntro = contentone;
	}

    /**
	 * Get option contents of all items
	 * @return content
	 */
	public ArrayList<String> getTrainerIntro(){
		return trainerIntro;
	}
}
