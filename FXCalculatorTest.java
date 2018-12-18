import org.junit.Assert;
import org.junit.Test;

public class FXCalculatorTest {

   
  @Test
  public void testFXModelMasterDIRECT(){
    
    FXModelMaster fxModelMaster  = new FXModelMaster("AUD","USD","in",100.00);      
    System.out.println(fxModelMaster);
    String targetedFXAmount = new ExchangeServiceImpl().getExchange(fxModelMaster);    
    System.out.println("Result DIRECT: "+targetedFXAmount+"\n");
    
    Assert.assertEquals("Check",targetedFXAmount,(fxModelMaster.getCcy1()+" "+String.format( "%.2f", fxModelMaster.getOriginalAmount())+" = "+fxModelMaster.getCcy2()+" "+String.format( "%.2f", 83.71 )));
  } 
  
  @Test
  public void testFXModelMasterDIRECT2ForUSDtoJPY(){
    
    FXModelMaster fxModelMaster  = new FXModelMaster("USD","JPY","in",100.00);      
    System.out.println(fxModelMaster);
    String targetedFXAmount = new ExchangeServiceImpl().getExchange(fxModelMaster);    
    System.out.println("Result DIRECT: "+targetedFXAmount+"\n");
    
    Assert.assertEquals("Check",targetedFXAmount,(fxModelMaster.getCcy1()+" "+String.format( "%.2f", fxModelMaster.getOriginalAmount())+" = "+fxModelMaster.getCcy2()+" "+String.format( "%.0f", 11995.0 )));
  } 
  
  @Test
  public void testFXModelMasterOneIsToOne(){
    
    FXModelMaster fxModelMaster  = new FXModelMaster("AUD","AUD","in",100.00);      
    System.out.println(fxModelMaster);
    String targetedFXAmount = new ExchangeServiceImpl().getExchange(fxModelMaster);    
    System.out.println("Result OneIsToOne: "+targetedFXAmount+"\n");
    
    Assert.assertEquals("Check",targetedFXAmount,(fxModelMaster.getCcy1()+" "+String.format( "%.2f", fxModelMaster.getOriginalAmount())+" = "+fxModelMaster.getCcy2()+" "+String.format( "%.2f", 100.00 )));
  }
  
   
  @Test
  public void testFXModelMasterInverted(){
    
    FXModelMaster fxModelMaster  = new FXModelMaster("JPY","USD","in",100.00);      
    System.out.println(fxModelMaster);
    String targetedFXAmount = new ExchangeServiceImpl().getExchange(fxModelMaster);    
    System.out.println("Result Inverted: "+targetedFXAmount+"\n");
    
    Assert.assertEquals("Check",targetedFXAmount,(fxModelMaster.getCcy1()+" "+String.format( "%.2f", fxModelMaster.getOriginalAmount())+" = "+fxModelMaster.getCcy2()+" "+String.format( "%.2f", 0.83 )));
  }
  
  @Test
  public void testFXModelMasterUnableToFind(){
    
    FXModelMaster fxModelMaster  = new FXModelMaster("KRK","FJD","in",100.00);      
    System.out.println(fxModelMaster);
    String targetedFXAmount = new ExchangeServiceImpl().getExchange(fxModelMaster);    
    System.out.println("Result UnableToFind: "+targetedFXAmount+"\n");
    
    Assert.assertEquals("Check",targetedFXAmount,("Unable to find rate for "+fxModelMaster.getCcy1()+"/"+fxModelMaster.getCcy2()));
  }
  
  @Test
  public void testFXModelMasterCROSS(){
    
    FXModelMaster fxModelMaster  = new FXModelMaster("AUD","JPY","in",1.00);      
    System.out.println(fxModelMaster);
    String targetedFXAmount = new ExchangeServiceImpl().getExchange(fxModelMaster);    
    System.out.println("Result CROSS: "+targetedFXAmount+"\n");
    
    Assert.assertEquals("Check",targetedFXAmount,(fxModelMaster.getCcy1()+" "+String.format( "%.2f", fxModelMaster.getOriginalAmount())+" = "+fxModelMaster.getCcy2()+" "+String.format( "%.0f", 100.41 )));
  }
  
  @Test
  public void testFXModelMasterCROSS2(){
    
    FXModelMaster fxModelMaster  = new FXModelMaster("AUD","DKK","in",100.00);      
    System.out.println(fxModelMaster);
    String targetedFXAmount = new ExchangeServiceImpl().getExchange(fxModelMaster);    
    System.out.println("Result CROSS: "+targetedFXAmount+"\n");
    
    Assert.assertEquals("Check",targetedFXAmount,(fxModelMaster.getCcy1()+" "+String.format( "%.2f", fxModelMaster.getOriginalAmount())+" = "+fxModelMaster.getCcy2()+" "+String.format( "%.2f", 505.76 )));
  }
  
}
	
