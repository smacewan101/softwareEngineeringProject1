/** 
 *@author Joshua Dickerson 
 * The Card class represents an instance of a playing card 
 * 
 * @param suit is the suit of this card object
 * @param rank is the rank of this card object
 * @param imgFilename is the filename of the graphic for the face of the card
 */

public class Card{

	private String suit;
	private int rank;
	private String imgFilename;

	public Card(String suit, int rank){
		setSuit(suit);
		setRank(rank);
		// setImgFilename(imgFilename);
	}

	/**
	* takes the numeric value representing rank and converts it to a "traditional" string
	* @return String the "traditional" name of this rank
	*/
	public String getRankTrad(){
		String rankTrad ="";
		switch (this.rank) {
			case 1:
            	rankTrad="ace";
            break;
            case 11:
            	rankTrad="jack";
            break;
            case 12:
            	rankTrad="queen";
            break;
            case 13:
            	rankTrad="king";
            break;
            default:
            	rankTrad=this.rank+"";
            break; 
		}

		return rankTrad;
	} // end getRankTrad()


	public String getSuit(){
		return this.suit;
	}

	public void setSuit(String suit){
		this.suit = suit;
	}

	public int getRank(){
		return this.rank;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public String getImgFilename(){
		return this.imgFilename;
	}

	public void setImgFilename(String imgFilename){
		this.imgFilename = imgFilename;
	}

	public String toString(){
		String tmp = this.getRankTrad()+" of "+this.getSuit();
		return tmp;
	}

	
} // end Card
