package utilities;

import org.testng.annotations.DataProvider;

public class datadrivernproviders {
	@DataProvider(name="testdata")
	public Object[][] iphonedata(){
		Object data[][]= {
				{"Iphone 15"},
				
				
		};
		return data;
	}

}
