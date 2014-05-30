package pku.edu.cn.monitor.restclient;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;






import javax.ws.rs.core.Response;

import org.apache.cxf.common.util.Base64Utility;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.provider.json.JSONProvider;
import org.apache.log4j.PropertyConfigurator;

public class Client {
	WebClient client;
	public Client(String baseUrl){
		List<Object> providers = new ArrayList<Object>();
	    providers.add(new JSONProvider<Object>());
		PropertyConfigurator.configure("conf/log4j.properties");
		client = WebClient.create(baseUrl,providers);
	}
	public Boolean restPost(String resourceUrl,Media m){
		String token = "gcks:gcks";
		Base64Utility.encode(token.getBytes());
		Response rs =client.path(resourceUrl).accept("application/json").header("Authorization", "Basic "+Base64Utility.encode(token.getBytes())).type("application/json").post(m);
		if(rs.getStatus()==200){
			return true;
		}
		else{
			System.out.println("false");
			return false;
		}
	}
//	public Boolean restPost(String resourceUrl,String data){
//		Response rs = client.path(resourceUrl).accept("application/json").type("application/json").query("ip",data).get();
//		return true;
//	}
	public static void main(String args[]){
		Client client = new Client("http://127.0.0.1:8080");
		Media m = new Media();
		m.setBegintime(new Date());
		client.restPost("/gcks.video/api/v1/video/medias", m);
	}
}
