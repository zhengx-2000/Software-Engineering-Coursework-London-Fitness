//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//存储各种预约信息，用户id，教练名字，训练目标，训练时间
public class Appointment {

    private static int userID, trainingTime; 
	private static String userid, trainerName, trainingAim;

	
	//private Calendar cal = Calendar.getInstance();
	//private java.text.SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	//private String cdate = sdf.format(cal.getTime());


    /**
	 * Get user ID number in int type
	 * @return user ID number in int type
	 */
    public int getUserID() {
		return userID;
	}
    
    /**
	 * Get training time
	 * @return training time
	 */
	public int getTrainingTime() {
		return trainingTime;
	}

	/**
	 * Get user ID number in string type
	 * @return user ID number in string type
	 */
	public String getUserid() {
		return userid;
	}

    /**
	 * Get trainer name
	 * @return trainer name
	 */
	public String getTrainerName() {
		return trainerName;
	}

    /**
	 * Get training trainingAim
	 * @return training trainingAim
	 */
	public String gettrainingAim() {
		return trainingAim;
	}

    /**
	 * Set ID number of user
	 * @param userID ID number of user
	 */
	public void setUserID(String userID) {
		Appointment.userID = Integer.parseInt(userID.substring(userID.indexOf(':') + 1));
		userid = userID;
	}

    /**
	 * Set Training Time of user
	 * @param trainingTime Training Time of user
	 */
	public void setTrainingTime(Integer trainingTime) {
		Appointment.trainingTime = trainingTime;
        //Integer.parseInt(trainingTime.substring(trainingTime.indexOf(':') + 1));
	}

    /**
	 * Set trainer Name
	 * @param trainerName trainer Name
	 */
	public void setTrainerName(String trainerName) {
		Appointment.trainerName = trainerName;
	}

        /**
	 * Set training Aim
	 * @param trainingAim training Aim
	 */
	public void setTrainingAim(String trainingAim) {
		Appointment.trainingAim = trainingAim;
	}
}
