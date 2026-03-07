package utilities;

import org.testng.annotations.DataProvider;

public class datadrivernproviders {
	@DataProvider(name="testdata",indices= {0})
	public Object[][] iphonedata(){
		Object data[][]= {
				{"Iphone 15"},
				{"Iphone 15 Pro"}
				
				
		};
		return data;
	}

}
