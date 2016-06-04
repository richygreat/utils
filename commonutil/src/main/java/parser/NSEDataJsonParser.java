package parser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.google.gson.Gson;

import bean.NseStock;

public class NSEDataJsonParser {
	public static void main(String[] args) {
		try {
			Document nse = Jsoup
					.connect(
							"https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuote.jsp?symbol=VIKASECO&illiquid=0&smeFlag=0&itpFlag=0")
					.get();

			String json = nse.text();
			json = json.substring("NSE - National Stock Exchange of India Ltd. { ".length(),
					json.indexOf("} Quote") + 1);
			System.out.println(json);

			Gson gson = new Gson();
			NseStock nseStock = gson.fromJson(json, NseStock.class);
			System.out.println(nseStock.getData().get(0).get("data"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
