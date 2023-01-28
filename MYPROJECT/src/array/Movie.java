package array;

public class Movie {

	public String name;
	public int yor;
	public String director;
	
	Movie(String name , int yor, String director){
		this.name=name;
		this.yor=yor;
		this.director=director;
		}
	public String toString() {
		return this.name+"year of release "+this.yor +" directed by "+ this.director;
	}
	public static void main(String[] args) {
		Movie[] dvdcollection = new Movie[3];
		Movie IncredibleDVD= new Movie("The Incredibles",2016,"as");
		Movie LionKingDVD= new Movie("LoinKing ",2014,"as");
		Movie BulletDVD=new Movie("Bullet",2032,"murga");
		dvdcollection[1]=IncredibleDVD;
		dvdcollection[0]=LionKingDVD;
		dvdcollection[2]=BulletDVD;
		
		for(int i =0;i<dvdcollection.length;i++) {
			System.out.println(dvdcollection[i]);
		}
		
	}
}
