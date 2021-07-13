package ausflug;

public class Ausflug {
	private boolean wochenTag, wetterGut, ferien, tagsUeber, mitKindern;
	private String bezeichnung;
	private Ausflug[] ausfluege;
	
	
	public Ausflug(String bezeichnung, boolean wochenTag, boolean wetterGut, boolean ferien, boolean tagsUeber, boolean mitKindern) {
		super();
		this.wochenTag = wochenTag;
		this.wetterGut = wetterGut;
		this.ferien = ferien;
		this.tagsUeber = tagsUeber;
		this.mitKindern = mitKindern;
		this.bezeichnung = bezeichnung;
	}
	

	public boolean isWochenTag() {
		return wochenTag;
	}



	public void setWochenTag(boolean wochenTag) {
		this.wochenTag = wochenTag;
	}



	public boolean isWetterGut() {
		return wetterGut;
	}



	public void setWetterGut(boolean wetterGut) {
		this.wetterGut = wetterGut;
	}



	public boolean isFerien() {
		return ferien;
	}



	public void setFerien(boolean ferien) {
		this.ferien = ferien;
	}



	public boolean isTagsUeber() {
		return tagsUeber;
	}



	public void setTagsUeber(boolean tagsUeber) {
		this.tagsUeber = tagsUeber;
	}



	public boolean isMitKindern() {
		return mitKindern;
	}



	public void setMitKindern(boolean mitKindern) {
		this.mitKindern = mitKindern;
	}



	public String getBezeichnung() {
		return bezeichnung;
	}



	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
