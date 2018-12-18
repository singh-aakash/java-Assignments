
public class Telivision {
	private int changeChannel;
	private int incVolume;
	private int descVolume;
	private boolean turn;
	//static volumes =44;
	public int getChangeChannel() {
		return changeChannel;
	}
	public void setChangeChannel(int changeChannel) {
		this.changeChannel = changeChannel;
	}
	public int getIncVolume() {
		return incVolume;
	}
	public void setIncVolume(int incVolume) {
		this.incVolume = incVolume;
	}
	public int getDescVolume() {
		return descVolume;
	}
	public void setDescVolume(int descVolume) {
		this.descVolume = descVolume;
	}
	public boolean isTurn() {
		return turn;
	}
	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	public boolean tvstate(){
		System.out.println(isTurn());
		if(isTurn() == true)
			{System.out.println("true");
			return true;}
		else
			{System.out.println("false");
			return false;}
	}
	public int tvVolume(){
		if(getIncVolume() < 100)
			return ++incVolume;
		else
			{
			if(getDescVolume() > 0)
				return --descVolume;
				return 0;
			}
	}
	public int tvChannel(){
		if(getChangeChannel() < 1000)
			return ++changeChannel;
		else
			{
			if(getChangeChannel() > 100)
				return --changeChannel;
				return 0;
			}
	}

}
