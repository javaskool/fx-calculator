For Single java File Application Based
======================================

D:\fx-calculator>javac FxCalculator.java

D:\fx-calculator>java FxCalculator
Syntax Error ...
Please use syntax : java com.anz.fx.starter.FxCalculatorStarterArgs <ccy1> <amount1> in <ccy2>.

D:\fx-calculator>java FxCalculator AUD 100 in USD
Calculating .....
Requested Conversion : FX Requested Data : [ccy1=AUD, originalAmount=100.0, inText=in, ccy2=USD]
Base Term Info : {AUD=1:1, CAD=USD, CNY=USD, CZK=USD, DKK=USD, EUR=USD, GBP=USD, JPY=USD, NOK=USD, NZD=USD, USD=DIRECT}
Conversion type : DIRECT
Result : DIRECT :: 83.71
Result : AUD 100.00 = USD 83.71

D:\fx-calculator>java FxCalculator AUD 100 in AUD
Calculating .....
Requested Conversion : FX Requested Data : [ccy1=AUD, originalAmount=100.0, inText=in, ccy2=AUD]
Base Term Info : {AUD=1:1, CAD=USD, CNY=USD, CZK=USD, DKK=USD, EUR=USD, GBP=USD, JPY=USD, NOK=USD, NZD=USD, USD=DIRECT}
Conversion type : 1:1
Result : 1:1 :: 100.0
Result : AUD 100.00 = AUD 100.00

D:\fx-calculator>java FxCalculator AUD 100.00 in DKK
Calculating .....
Requested Conversion : FX Requested Data : [ccy1=AUD, originalAmount=100.0, inText=in, ccy2=DKK]
Base Term Info : {AUD=1:1, CAD=USD, CNY=USD, CZK=USD, DKK=USD, EUR=USD, GBP=USD, JPY=USD, NOK=USD, NZD=USD, USD=DIRECT}
Conversion type : USD
Looking for crossed conversion
Intermediate Conversion type : USD
Base/Term : AUD :: USD
Next Conversion Condition for : DIRECT
Rate : 0.8371
Updated Rate : 0.8371
Next Conversion updatedRate with USD: 0.8371
Base/Term : USD :: DKK
Next Conversion Condition for : EUR
Base/Term : USD :: EUR
Next Conversion Condition for : INVERTED
Rate : 1.2315
Inverted Rate : 0.8120178643930166
Updated Rate : 0.6797401542833942
Next Conversion updatedRate with EUR: 0.6797401542833942
Base/Term : EUR :: DKK
Next Conversion Condition for : DIRECT
Rate : 7.4405
Updated Rate : 5.057606617945594
Next Conversion updatedRate with DKK: 5.057606617945594
Final Conversion rate : 5.057606617945594
Final Conversion amount : 505.7606617945594
Result : USD :: 505.7606617945594
Result : AUD 100.00 = DKK 505.76

D:\fx-calculator>java FxCalculator JPY 100.00 in USD
Calculating .....
Requested Conversion : FX Requested Data : [ccy1=JPY, originalAmount=100.0, inText=in, ccy2=USD]
Base Term Info : {AUD=USD, CAD=USD, CNY=USD, CZK=USD, DKK=USD, EUR=USD, GBP=USD, JPY=1:1, NOK=USD, NZD=USD, USD=INVERTED}
Conversion type : INVERTED
Rate : 119.95
Inverted Rate : 0.008336807002917883
Result : INVERTED :: 0.8336807002917883
Result : JPY 100.00 = USD 0.83

D:\fx-calculator>java FxCalculator KRW 100.00 in FJD
Calculating .....
Requested Conversion : FX Requested Data : [ccy1=KRW, originalAmount=100.0, inText=in, ccy2=FJD]
Result : Unable to find rate for KRW/FJD

D:\fx-calculator>java FxCalculator aud 100 in usd
Calculating .....
Requested Conversion : FX Requested Data : [ccy1=AUD, originalAmount=100.0, inText=in, ccy2=USD]
Base Term Info : {AUD=1:1, CAD=USD, CNY=USD, CZK=USD, DKK=USD, EUR=USD, GBP=USD, JPY=USD, NOK=USD, NZD=USD, USD=DIRECT}
Conversion type : DIRECT
Result : DIRECT :: 83.71
Result : AUD 100.00 = USD 83.71

D:\fx-calculator>


For Running test cases
======================

D:\fx-calculator>javac FxCalculator.java

D:\fx-calculator>javac FXCalculatorJUnitTest.java FXCalculatorTest.java

D:\fx-calculator>java FXCalculatorJUnitTest














