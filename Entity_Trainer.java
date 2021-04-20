//entity class储教练名字和教练的intro
/*	Name    ：
*	AimType1:
*	AimType2:	
*	License ：
*	Intro   ： 
*/

public class Entity_Trainer {
    private String trainerName;
    //private String trainerName;
    private String trainerLicense;
	private String aimType1;
	private String aimType2;
    private String trainerIntro;

	public Entity_Trainer(){}//构造器
	
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
		this.trainerName = trainerName;
	}

	/**
	 * Get trainerLicense
	 * @return trainerLicense
	 */
	public String getTrainerLicense() {
		return trainerLicense;
	}

    /**
	 * Set TrainerLicense
	 * @param trainerLicense TrainerLicense
	 */
	public void setTrainerLicense(String trainerLicense) {
		this.trainerLicense = trainerLicense;
	}
	
	/**
	 * Get aimType1
	 * @return aimType1
	 */
	public String getAimType1() {
		return aimType1;
	}

    /**
	 * Set aimType1
	 * @param aimType1 aimType1
	 */
	public void setAimType1(String aimType1) {
		this.aimType1 = aimType1;
	}
	
	/**
	 * Get aimType2
	 * @return aimType2
	 */
	public String getAimType2() {
		return aimType2;
	}

    /**
	 * Set aimType2
	 * @param aimType2 aimType2
	 */
	public void setAimType2(String aimType2) {
		this.aimType2 = aimType2;
	}

    /**
	 * Get trainerIntro
	 * @return trainerIntro
	 */
	public String getTrainerIntro() {
		return trainerIntro;
	}

    /**
	 * Set trainerIntro
	 * @param trainerIntro trainerIntro
	 */
	public void setTrainerIntro(String trainerIntro) {
		this.trainerIntro = trainerIntro;
	}

}
