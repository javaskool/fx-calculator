ReadMe2 file is having steps for running application as micro service
======================================================================

Folder hierarchy
================

fx-calculator
	|
	+-->libs
	|	|
	|   +-->config
	|   +-->lib
	|   +-->keystore
	|   +-->log
	|	+-->fx-calculator.log
	|	|
	+-->fx-calculator-0.0.1.jar


For Windows
===========
On One Terminal
+++++++++++++++
D:\fx-calculator\libs>java -jar fx-calculator-0.0.1.jar

On Second Terminal
++++++++++++++++++

D:\fx-calculator\libs>set CLASSPATH=lib/*;fx-calculator-0.0.1.jar;

D:\fx-calculator\libs>java com.anz.fx.starter.FxCalculatorStarterArgs
Syntax Error ...
Please use syntax : java com.anz.fx.starter.FxCalculatorStarterArgs <ccy1> <amount1> in <ccy2>.

D:\fx-calculator\libs>java com.anz.fx.starter.FxCalculatorStarterArgs AUD 100.00 in USD
18:14:02.267 [main] INFO com.anz.fx.serviceimpl.ExchangeServiceImpl - Calculating .....
18:14:02.274 [main] INFO com.anz.fx.serviceimpl.ExchangeServiceImpl - DIRECT
18:14:02.275 [main] INFO com.anz.fx.serviceimpl.ExchangeServiceImpl - Result : DIRECT :: 83.71
18:14:02.280 [main] INFO com.anz.fx.starter.FxCalculatorStarterArgs - Result : AUD 100.00 = USD 83.71


For Linux
=========
1. First start micro service by below command

deploy@anuj/fx-calculator/libs$ ls
config  fx-calculator-0.0.1.jar  keystore  lib  log
deploy@anuj/fx-calculator/libs$ java -jar fx-calculator-0.0.1.jar  &

deploy@anuj/fx-calculator/libs$ curl http://localhost:5454/fx-calculator-api/fx/calculate/AUD/USD/200.00

2. Second : by using command line

deploy@anuj/fx-calculator/libs$ export CLASSPATH=$CLASSPATH:lib/*:fx-calculator-0.0.1.jar:

deploy@anuj/fx-calculator/libs$ java com.anz.fx.starter.FxCalculatorStarterArgs AUD 100.00 in USD
21:32:25.578 [main] INFO com.anz.fx.serviceimpl.ExchangeServiceImpl - Calculating .....
21:32:25.585 [main] INFO com.anz.fx.serviceimpl.ExchangeServiceImpl - DIRECT
21:32:25.587 [main] INFO com.anz.fx.serviceimpl.ExchangeServiceImpl - Result : DIRECT :: 83.71
21:32:25.591 [main] INFO com.anz.fx.starter.FxCalculatorStarterArgs - Result : AUD 100.00 = USD 83.71

deploy@anuj/fx-calculator/libs$ java com.anz.fx.starter.FxCalculatorStarterArgs AUD 100.00 in AUD
21:33:00.957 [main] INFO com.anz.fx.serviceimpl.ExchangeServiceImpl - Calculating .....
21:33:00.964 [main] INFO com.anz.fx.serviceimpl.ExchangeServiceImpl - 1:1
21:33:00.965 [main] INFO com.anz.fx.serviceimpl.ExchangeServiceImpl - Result : 1:1 :: 100.0
21:33:00.970 [main] INFO com.anz.fx.starter.FxCalculatorStarterArgs - Result : AUD 100.00 = AUD 100.00
deploy@anuj/fx-calculator/libs$


Using Web Page
==============
First start micro service by below command and then call in any browser by using below URL

D:\fx-calculator\libs>java -jar fx-calculator-0.0.1.jar

URL Syntax :

http://localhost:5454/fx-calculator-api/fx/calculate/{ccy1}/{ccy2}/{amount1}

Here :{ccy1} is base , {ccy2} is term and {amount1} is requested amount for conversion.

URL with parameter :
http://localhost:5454/fx-calculator-api/fx/calculate/AUD/USD/200.00

Output in body :
AUD 200.00 = USD 167.42








