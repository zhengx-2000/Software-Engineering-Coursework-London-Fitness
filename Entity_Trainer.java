/*	The introduction of the trainer includes
*	Name    :
*	AimType1:
*	AimType2:	
*	License :
*	Intro   :
*/

/**
 * Title : Entity_Trainer.java
 * Description: This class is an entity class of trainers.
 *
 * @author : Mengqi Chen
 * @since : 25/5/2021
 */
public class Entity_Trainer {
	
	private String trainerName;		// trainer's name
    private String trainerLicense;	// trainer's license
	private String aimType1;		// The first fitness course that trainer is good at
	private String aimType2;		// The second fitness course that trainer is good at
    private String trainerIntro;	// The simple text introduction of Trainer
	
    /**
	 * Get trainer's name
	 * @return trainerName
	 */
	public String getTrainerName() {
		return trainerName;
	}

	/**
	 * Get trainer's license
	 * @return trainerLicense
	 */
	public String getTrainerLicense() {
		return trainerLicense;
	}

	/**
	 * Get aimType1. The first fitness course that trainer is good at
	 * @return aimType1
	 */
	public String getAimType1() {
		return aimType1;
	}

	/**
	 * Get aimType2. The second fitness course that trainer is good at
	 * @return aimType2
	 */
	public String getAimType2() {
		return aimType2;
	}

    /**
	 * Get the simple text introduction of Trainer 
	 * @return trainerIntro
	 */
	public String getTrainerIntro() {
		return trainerIntro;
	}

    /**
	 * Set trainer's name
	 * @param trainerName trainer's name
	 */
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

    /**
	 * Set trainer's license
	 * @param trainerLicense trainer's license
	 */
	public void setTrainerLicense(String trainerLicense) {
		this.trainerLicense = trainerLicense;
	}
	
    /**
	 * Set aimType1. The first fitness course that trainer is good at
	 * @param aimType1 The first fitness course that trainer is good at
	 */
	public void setAimType1(String aimType1) {
		this.aimType1 = aimType1;
	}

    /**
	 * Set aimType2. The second fitness course that trainer is good at
	 * @param aimType2 The second fitness course that trainer is good at
	 */
	public void setAimType2(String aimType2) {
		this.aimType2 = aimType2;
	}

    /**
	 * Set the simple text introduction of Trainer 
	 * @param trainerIntro The simple text introduction of Trainer 
	 */
	public void setTrainerIntro(String trainerIntro) {
		this.trainerIntro = trainerIntro;
	}

}
