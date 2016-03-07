package b0102;
 
/**
 * Bu sýnýf, bir araba soyutlamasýnýn (abstraction) nasýl yapýlacaðýný anlatmaktadýr. 
 * <code>Car</code> sýnýfý, gerçek dünyadaki arabaya karþýlýk gelmekte yani araba soyutlamasýný ifade etmektedir.
 * <code>Car</code> sýnýfý bir çok deðiskene sahip olup, müþterilerine belli hizmetler sunmaktadýr. 
 * Bu cümleyi daha doðru bir þekilde, “<code>Car</code> sýnýfýndan üretilen nesnelerin bir durumu ve 
 * sorumluluklarý vardýr” þeklinde söyleyebiliriz.
 * 
 *  
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * 		   <p>
 *         Daha fazla bilgi için: 
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
     * Arabanýn kilometresini kendisine geçilen parametre kadar artýrýr. 
     * 
     * @param newDistance
     * 					Arabanýn katettiði yolun uzunluðudur.
     */
    public void go(int newDistance){
        distance += newDistance;
    }
     
    /**
     * Arabanýn hýzýnda deðiþiklik yapmayý saðlar.
     * 
     * @param newSpeed
     * 					Arabanýn yeni hýzýdýr.	
     */
    public void accelerate(int newSpeed){
        speed = newSpeed;
    }
    
    /**
     * Arabanýn durmasýný saðlar. 
     */
    public void stop(){
        speed = 0;
    }
     
    /**
     * Araba hakkýnda bilgi almaya yarar.  
     * @return 
     * 			Arabanýn o anki güncel bilgisini verir.
     */
    public String getInfo(){
        return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and travelling at " + speed + " kmph.";
    }
}