import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


class FXModelMaster {

  //"<ccy1> <amount1> in <ccy2>", 
 
  private String ccy1;
  private String ccy2;
  private String inText;
  
  private Double originalAmount;
  private Double exchangedAmount;
  
 
  public FXModelMaster(String ccy1, String ccy2, String inText, Double originalAmount) {
    super();
    this.ccy1 = ccy1.toUpperCase();
    this.ccy2 = ccy2.toUpperCase();
    this.inText = inText;
    this.originalAmount = originalAmount;
  }
  
  public String getCcy1() {
    return ccy1;
  }
  public void setCcy1(String ccy1) {
    this.ccy1 = ccy1;
  }
  public String getCcy2() {
    return ccy2;
  }
  public void setCcy2(String ccy2) {
    this.ccy2 = ccy2;
  }
  public String getInText() {
    return inText;
  }
  public void setInText(String inText) {
    this.inText = inText;
  }
  public Double getOriginalAmount() {
    return originalAmount;
  }
  public void setOriginalAmount(Double originalAmount) {
    this.originalAmount = originalAmount;
  }
  public Double getExchangedAmount() {
    return exchangedAmount;
  }
  public void setExchangedAmount(Double exchangedAmount) {
    this.exchangedAmount = exchangedAmount;
  }

  @Override
  public String toString() {
    return "FX Requested Data : [ccy1=" + ccy1 + ", originalAmount=" + originalAmount + ", inText="
        + inText + ", ccy2=" + ccy2 + "]";
  } 

}

class MetadataUtils {

  Map<String, Double> base_term_direct;  
  
  Map<String, Map<String, String>> base_term_matrix;
  
  
  public MetadataUtils() {

    base_term_direct=new HashMap<String, Double>();
    base_term_direct.put("AUD_USD", 0.8371);
    base_term_direct.put("CAD_USD", 0.8711);
    base_term_direct.put("USD_CNY", 6.1715);
    base_term_direct.put("EUR_USD", 1.2315);
    base_term_direct.put("GBP_USD", 1.5683);
    
    base_term_direct.put("NZD_USD", 0.7750);
    base_term_direct.put("USD_JPY", 119.95);
    base_term_direct.put("EUR_CZK", 27.6028);
    base_term_direct.put("EUR_DKK", 7.4405);
    base_term_direct.put("EUR_NOK", 8.6651);
        
    base_term_matrix=new HashMap<String, Map<String, String>>();
    
    //1.
    Map<String, String> audList=new TreeMap<>();
    audList.put("AUD", "1:1");        
    audList.put("CAD", "USD");  
    audList.put("CNY", "USD");    
    audList.put("CZK", "USD");        
    audList.put("DKK", "USD");  
    audList.put("EUR", "USD");
    
    audList.put("GBP", "USD");       
    audList.put("JPY", "USD");  
    audList.put("NOK", "USD");    
    audList.put("NZD", "USD");        
    audList.put("USD", "DIRECT");  
    
    
    //2.
    Map<String, String> cadList=new TreeMap<>();
    cadList.put("AUD", "USD");  
    cadList.put("CAD", "1:1");
    cadList.put("CNY", "USD");
    cadList.put("CZK", "USD");        
    cadList.put("DKK", "USD");  
    cadList.put("EUR", "USD");
    
    cadList.put("GBP", "USD");       
    cadList.put("JPY", "USD");  
    cadList.put("NOK", "USD");    
    cadList.put("NZD", "USD");        
    cadList.put("USD", "DIRECT");  
    
    //3.
    Map<String, String> cnyList=new TreeMap<>();
    cnyList.put("AUD", "USD");    
    cnyList.put("CAD", "USD"); 
    cnyList.put("CNY", "1:1"); 
    cnyList.put("CZK", "USD");        
    cnyList.put("DKK", "USD");  
    cnyList.put("EUR", "USD");
    
    cnyList.put("GBP", "USD");       
    cnyList.put("JPY", "USD");  
    cnyList.put("NOK", "USD");    
    cnyList.put("NZD", "USD");        
    cnyList.put("USD", "DIRECT");  
    
    //4.
    Map<String, String> czkList=new TreeMap<>();
    czkList.put("AUD", "USD");
    czkList.put("CAD", "USD");
    czkList.put("CNY", "USD");
    czkList.put("CZK", "1:1");        
    czkList.put("DKK", "EUR");  
    czkList.put("EUR", "INVERTED");
    
    czkList.put("GBP", "USD");       
    czkList.put("JPY", "USD");  
    czkList.put("NOK", "EUR");    
    czkList.put("NZD", "USD");        
    czkList.put("USD", "EUR");  
    
    //5.
    Map<String, String> dkkList=new TreeMap<>();
    dkkList.put("AUD", "USD");
    dkkList.put("CAD", "USD");
    dkkList.put("CNY", "USD");
    dkkList.put("CZK", "EUR");        
    dkkList.put("DKK", "1:1");  
    dkkList.put("EUR", "INVERTED");
    
    dkkList.put("GBP", "USD");       
    dkkList.put("JPY", "USD");  
    dkkList.put("NOK", "EUR");    
    dkkList.put("NZD", "USD");        
    dkkList.put("USD", "EUR");  
    
    //6.
    Map<String, String> eurList=new TreeMap<>();
    eurList.put("AUD", "USD");
    eurList.put("CAD", "USD");
    eurList.put("CNY", "USD");
    eurList.put("CZK", "DIRECT");        
    eurList.put("DKK", "DIRECT");  
    eurList.put("EUR", "1:1");
    
    eurList.put("GBP", "USD");       
    eurList.put("JPY", "USD");  
    eurList.put("NOK", "DIRECT");    
    eurList.put("NZD", "USD");        
    eurList.put("USD", "DIRECT");  
    
    //7.
    Map<String, String> gbpList=new TreeMap<>();
    gbpList.put("AUD", "USD");
    gbpList.put("CAD", "USD");
    gbpList.put("CNY", "USD");
    gbpList.put("CZK", "USD");        
    gbpList.put("DKK", "USD");  
    gbpList.put("EUR", "USD");
    
    gbpList.put("GBP", "1:1");       
    gbpList.put("JPY", "USD");  
    gbpList.put("NOK", "USD");    
    gbpList.put("NZD", "USD");        
    gbpList.put("USD", "DIRECT");  
    
    //8.
    Map<String, String> jpyList=new TreeMap<>();
    jpyList.put("AUD", "USD");
    jpyList.put("CAD", "USD");
    jpyList.put("CNY", "USD");
    jpyList.put("CZK", "USD");        
    jpyList.put("DKK", "USD");  
    jpyList.put("EUR", "USD");
    
    jpyList.put("GBP", "USD");       
    jpyList.put("JPY", "1:1");  
    jpyList.put("NOK", "USD");    
    jpyList.put("NZD", "USD");        
    jpyList.put("USD", "INVERTED");  
    
    //9.
    Map<String, String> nokList=new TreeMap<>();
    nokList.put("AUD", "USD");
    nokList.put("CAD", "USD");
    nokList.put("CNY", "USD");
    nokList.put("CZK", "EUR");        
    nokList.put("DKK", "EUR");  
    nokList.put("EUR", "INVERTED");
    
    nokList.put("GBP", "USD");       
    nokList.put("JPY", "USD");  
    nokList.put("NOK", "1:1");    
    nokList.put("NZD", "USD");        
    nokList.put("USD", "EUR");  
    
    //10.
    Map<String, String> nzdList=new TreeMap<>();
    nzdList.put("AUD", "USD");
    nzdList.put("CAD", "USD");
    nzdList.put("CNY", "USD");
    nzdList.put("CZK", "USD");        
    nzdList.put("DKK", "USD");  
    nzdList.put("EUR", "USD");
    
    nzdList.put("GBP", "USD");       
    nzdList.put("JPY", "USD");  
    nzdList.put("NOK", "USD");    
    nzdList.put("NZD", "1:1");        
    nzdList.put("USD", "DIRECT");  
    
    //11.
    Map<String, String> usdList=new TreeMap<>();
    usdList.put("AUD", "INVERTED");
    usdList.put("CAD", "INVERTED");
    usdList.put("CNY", "INVERTED");
    usdList.put("CZK", "EUR");        
    usdList.put("DKK", "EUR");  
    usdList.put("EUR", "INVERTED");
    
    usdList.put("GBP", "INVERTED");       
    usdList.put("JPY", "DIRECT");  
    usdList.put("NOK", "EUR");    
    usdList.put("NZD", "INVERTED");        
    usdList.put("USD", "1:1");  
    
    
    base_term_matrix.put("AUD", audList );
    base_term_matrix.put("CAD", cadList );
    base_term_matrix.put("CNY", cnyList );
    base_term_matrix.put("CZK", czkList );
    base_term_matrix.put("DKK", dkkList );
    
    base_term_matrix.put("EUR", eurList );
    base_term_matrix.put("GBP", gbpList );
    base_term_matrix.put("JPY", jpyList );
    base_term_matrix.put("NOK", nokList );
    base_term_matrix.put("NZD", nzdList );
    
    base_term_matrix.put("USD", usdList );
    
    
    
  }

  public Map<String, Map<String, String>> getBase_term_matrix() {
    return base_term_matrix;
  }

  public void setBase_term_matrix(Map<String, Map<String, String>> base_term_matrix) {
    this.base_term_matrix = base_term_matrix;
  }

  public Map<String, String> getBase_term_data(String base)
  {
    return base_term_matrix.get(base);
  }
  
  public String getBase_term_data(String base,String term)
  {
    return base_term_matrix.get(base).get(term);
  }
  
  
  public Double getBase_term_direct(String base)
  {
    return base_term_direct.get(base);
  }
  
  

}

interface ExchangeService {
  public String getExchange(FXModelMaster fxModelMaster);
  
}

class ExchangeServiceImpl implements ExchangeService {

  

    public String getExchange(FXModelMaster fxModelMaster) {
    
    System.out.println("Calculating .....");   
    String exchangedAmount=calculate(fxModelMaster);      
    return exchangedAmount;
    }
  
  
    public String calculate(FXModelMaster fxModelMaster)
    {
      
      Double exchangedAmount=0.00;
      String ccy1=fxModelMaster.getCcy1();
      String ccy2=fxModelMaster.getCcy2();
     
      Double originalAmount=fxModelMaster.getOriginalAmount();
      String retVal="";
      System.out.println("Requested Conversion : "+fxModelMaster);
      MetadataUtils metadataUtils=new MetadataUtils();
      Map<String, String> baseTermInfos= metadataUtils.getBase_term_data(fxModelMaster.getCcy1());
      
      if(baseTermInfos==null)
      {
        retVal="Unable to find rate for "+fxModelMaster.getCcy1()+"/"+fxModelMaster.getCcy2();
      }
      else
      {
        
          System.out.println("Base Term Info : "+baseTermInfos.toString());
          String rateType=baseTermInfos.get(fxModelMaster.getCcy2());
          System.out.println("Conversion type : "+rateType);
          
          Double rate=0.00;
          
          if(rateType.equals("DIRECT"))
          {
            rate=metadataUtils.getBase_term_direct(fxModelMaster.getCcy1()+"_"+fxModelMaster.getCcy2());
            exchangedAmount=originalAmount*rate;
          }
          else if(rateType.equals("1:1"))
          {
            rate=1.00;
            exchangedAmount=originalAmount*rate;
          } 
          else if(rateType.equals("INVERTED"))
          {
            rate=metadataUtils.getBase_term_direct(fxModelMaster.getCcy2()+"_"+fxModelMaster.getCcy1());
            System.out.println("Rate : "+rate);
            rate=1/rate;
            System.out.println("Inverted Rate : "+rate);
            
            exchangedAmount=originalAmount*rate;
            
          } 
          else //if(rateType.equals("CROSSED"))
          {
              System.out.println("Looking for crossed conversion");
              System.out.println("Intermediate Conversion type : "+rateType);                 
              Double rate1=1.00;
              Double exchangedAmountRate=finalCrossValuesRate(metadataUtils,fxModelMaster.getCcy1(),rateType, fxModelMaster.getCcy2(),rate1);
              System.out.println("Final Conversion rate : "+exchangedAmountRate);
              
              exchangedAmount=originalAmount*exchangedAmountRate;
              System.out.println("Final Conversion amount : "+exchangedAmount);
                         
          }         
          
          
          System.out.println("Result : "+rateType+" :: "+exchangedAmount);
          retVal=ccy1+" "+String.format( "%.2f", originalAmount )+" = "+ccy2+" "+(ccy2.equals("JPY") ? String.format( "%.0f", exchangedAmount ) : String.format( "%.2f", exchangedAmount ));
      }
      return retVal;
    }   
  
    public Double finalCrossValuesRate(MetadataUtils metadataUtils,String ccy1,String rateType, String ccy2,Double rate1)
    {
      
      String lastconversion=ccy1;
      double updatedRate=1.0;
      while(lastconversion != ccy2)
      {
        System.out.println("Base/Term : "+lastconversion+ " :: "+rateType);
       
  
      String baseTermInfos2= metadataUtils.getBase_term_data(lastconversion,rateType);
            System.out.println("Next Conversion Condition for : "+baseTermInfos2);  
            
        //    double updatedRate=1.0;
          if(baseTermInfos2.equals("DIRECT"))
            {
              double newrate=metadataUtils.getBase_term_direct(lastconversion+"_"+rateType);
              System.out.println("Rate : "+newrate);
              updatedRate= updatedRate*newrate;
              System.out.println("Updated Rate : "+updatedRate);
              System.out.println("Next Conversion updatedRate with "+rateType+": "+updatedRate);
            //  return updatedRate;
              lastconversion=rateType;
              rateType=ccy2;
            }
            else if(baseTermInfos2.equals("1:1"))
            {
              double newrate=1.00;
              System.out.println("Rate : "+newrate);
              updatedRate=  updatedRate*newrate;
              System.out.println("Updated Rate : "+updatedRate);
              System.out.println("Next Conversion updatedRate with "+rateType+": "+updatedRate);
              //return updatedRate;
              lastconversion=rateType;
              rateType=ccy2;
            } 
            else if(baseTermInfos2.equals("INVERTED"))
            {
              double newrate=metadataUtils.getBase_term_direct(rateType+"_"+lastconversion);
              System.out.println("Rate : "+newrate);
              newrate=1/newrate;
              System.out.println("Inverted Rate : "+newrate);
              updatedRate=  updatedRate*newrate;
              System.out.println("Updated Rate : "+updatedRate);
              System.out.println("Next Conversion updatedRate with "+rateType+": "+updatedRate);
              //return updatedRate;
              lastconversion=rateType;
              rateType=ccy2;
            }
            else
            {
              //  lastconversion=baseTermInfos2;
                rateType=baseTermInfos2;
            }
      }

          return updatedRate;
      }

    }


public class FxCalculator {  

  
   public static void main(String[] args) {
       
    if(args.length==4)
    {
    String ccy1=args[0];
    Double originalAmount=Double.parseDouble(args[1]);
    String inText=args[2];    
    String ccy2=args[3];
    
    FXModelMaster fxModelMaster=new FXModelMaster(ccy1, ccy2, inText, originalAmount);
    String targetedStringValue = new ExchangeServiceImpl().getExchange(fxModelMaster); 
    System.out.println("Result : "+targetedStringValue);
  
    }
    else
    {
      System.out.println("Syntax Error ...");
      System.out.println("Please use syntax : java com.anz.fx.starter.FxCalculatorStarterArgs <ccy1> <amount1> in <ccy2>.");
    }
    
  }
}
