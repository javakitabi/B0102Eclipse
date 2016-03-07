package b0102;
 
/**
 * Bu s�n�f, bir araba soyutlamas�n�n (abstraction) nas�l yap�laca��n� anlatmaktad�r. 
 * <code>Car</code> s�n�f�, ger�ek d�nyadaki arabaya kar��l�k gelmekte yani araba soyutlamas�n� ifade etmektedir.
 * <code>Car</code> s�n�f� bir �ok de�iskene sahip olup, m��terilerine belli hizmetler sunmaktad�r. 
 * Bu c�mleyi daha do�ru bir �ekilde, �<code>Car</code> s�n�f�ndan �retilen nesnelerin bir durumu ve 
 * sorumluluklar� vard�r� �eklinde s�yleyebiliriz.
 * 
 *  
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * 		   <p>
 *         Daha fazla bilgi i�in: 
 *       	@see  <a href="http://www.javaturk.org" target="_blank">javaturk.org</a>
 *         
 * 			@see <a href="http://www.javakitabi.com" target="_blank">javakitabi.com</a>
 */
public class Car {
 
    String make;
    String model;
    String year;
    int speed;
    int distance;
      
    /**
     * Araban�n kilometresini kendisine ge�ilen parametre kadar art�r�r. 
     * 
     * @param newDistance
     * 					Araban�n katetti�i yolun uzunlu�udur.
     */
    public void go(int newDistance){
        distance += newDistance;
    }
     
    /**
     * Araban�n h�z�nda de�i�iklik yapmay� sa�lar.
     * 
     * @param newSpeed
     * 					Araban�n yeni h�z�d�r.	
     */
    public void accelerate(int newSpeed){
        speed = newSpeed;
    }
    
    /**
     * Araban�n durmas�n� sa�lar. 
     */
    public void stop(){
        speed = 0;
    }
     
    /**
     * Araba hakk�nda bilgi almaya yarar.  
     * @return 
     * 			Araban�n o anki g�ncel bilgisini verir.
     */
    public String getInfo(){
        return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and travelling at " + speed + " kmph.";
    }
}