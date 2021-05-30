
/**
 * Title : Entity_Appointment.java 
 * Description: This class is an entity class of user's Appointment.
 * 
 * @author : Mengqi Chen
 * @date : 25/5/2021
 */

public class Entity_Appointment {

    private static int userID;			// user's ID number
	private static int trainingTime;	// user's training time
	private static String userid;		// user's ID string
	private static String trainerName;	// the name of user's trainer
	private static String trainingAim;	// user's training aim

    /**
	 * Get user's ID number in int type
	 * @return userID
	 */
    public int getUserID() {
		return userID;
	}
    
    /**
	 * Get user's training time
	 * @return trainingTime
	 */
	public int getTrainingTime() {
		return trainingTime;
	}

	/**
	 * Get user's ID string in string type
	 * @return userid
	 */
	public String getUserid() {
		return userid;
	}

    /**
	 * Get the name of user's trainer
	 * @return trainerName
	 */
	public String getTrainerName() {
		return trainerName;
	}

    /**
	 * Get user's training aim
	 * @return trainingAim
	 */
	public String gettrainingAim() {
		return trainingAim;
	}

    /**
	 * Set user's ID number in String
	 * @param userID user's ID number in String
	*/
	public void setUserID(String userID) {
		Entity_Appointment.userID = Integer.parseInt(userID);
		userid = userID;
	} 

    /**
	 * Set user's training time
	 * @param trainingTime user's training time
	 */
	public void setTrainingTime(Integer trainingTime) {
		Entity_Appointment.trainingTime = trainingTime;
	}

    /**
	 * Set the name of user's trainer
	 * @param trainerName the name of user's trainer
	 */
	public void setTrainerName(String trainerName) {
		Entity_Appointment.trainerName = trainerName;
	}

    /**
	 * Set user's training aim
	 * @param trainingAim user's training aim
	 */
	public void setTrainingAim(String trainingAim) {
		Entity_Appointment.trainingAim = trainingAim;
	}
}
